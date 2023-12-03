package com.appone.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appone.model.Customer;
import com.appone.model.Product;
import com.appone.service.CustomerJpaService;
import com.appone.service.ProductJpaService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductJpaService productService;
	
	@GetMapping("/products")
	public ArrayList<Product> getProducts()
	{
		return productService.getsProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getProductId(@PathVariable int productId)
	{
		return productService.getProductById(productId);
	}
	
	@PostMapping("/productss/addnewproduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@PutMapping("/products/{productId}")
	public Product updateProduct(@PathVariable int productId,@RequestBody Product product)
	{
		return productService.updateProduct(productId,product);
	}
	
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable int productId)
	{
		productService.deleteProduct(productId);
	}
	
	@GetMapping("/products/addnewcustomer")
	public ArrayList<Customer> getProductCustomer(int productId)
	{
		return productService.getProductCustomer(productId);
	}



}
