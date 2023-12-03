package com.appone.repository;


import java.util.ArrayList;
import java.util.List;


import com.appone.model.Customer;
import com.appone.model.Product;

public interface ProductRepository 
{
	ArrayList<Product> getsProducts();
	Product getProductById(int productId);
	Product addProduct(Product product);
	Product updateProduct(int productId,Product product);
	void deleteProduct(int productId);
	ArrayList<Customer> getProductCustomer(int productId);
}
