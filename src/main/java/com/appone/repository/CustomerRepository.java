package com.appone.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.appone.model.Customer;
import com.appone.model.Product;

public interface CustomerRepository 
{
	
	
	ArrayList<Customer> getCustomers();
	Customer getCustomerById(int customerId);
	Customer addCustomer(Customer customer);
	Customer updateCustomer(int customerId,Customer customer);
	void deleteCustomer(int customerId);
	//Customer getProductCustomer(int customerId);
	//List<Product> getCustomerProductss(int customerId);

}
