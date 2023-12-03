package com.appone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.appone.model.Customer;
import com.appone.model.Product;
import com.appone.repository.CustomerJpaRepository;
import com.appone.repository.ProductJpaRepository;
import com.appone.repository.ProductRepository;

@Service
public class ProductJpaService implements ProductRepository 
{
     @Autowired
     private ProductJpaRepository productJpaRepository;
     
     @Autowired
     private CustomerJpaRepository customerJpaRepository;
	@Override
	public ArrayList<Product> getsProducts() 
	{
		List<Product> productList=productJpaRepository.findAll();
		ArrayList<Product> products=new ArrayList<>(productList);
		return products;
	}

	@Override
	public Product getProductById(int productId) 
	{
		try
		{
			Product product=productJpaRepository.findById(productId).get();
			return product;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
			}

	@Override
	public Product addProduct(Product product) 
	{
		productJpaRepository.save(product);
	      return product;
	}

	@Override
	public Product updateProduct(int productId, Product product) 
	{
		try
		{
			Product existingProduct=productJpaRepository.findById(productId).get();
			if(product.getProductName()!=null)
			{
				existingProduct.setProductName(product.getProductName());
			}
			
			productJpaRepository.save(existingProduct);
			return existingProduct;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}	
	}
	

	@Override
	public void deleteProduct(int productId) 
	{
		try
		{
			Product product=productJpaRepository.findById(productId).get();
			if(product!=null)
			{
				productJpaRepository.deleteById(productId);
			}
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public ArrayList<Customer> getProductCustomer(int productId) 
	{
		List<Customer> customerList=customerJpaRepository.findAll();
		ArrayList<Customer> customers=new ArrayList<>(customerList);
		return customers;
	}

		
}
	


