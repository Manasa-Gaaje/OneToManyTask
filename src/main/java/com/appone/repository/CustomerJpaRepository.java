package com.appone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.appone.model.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer,Integer> 
{

}
