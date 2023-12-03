package com.appone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.appone.model.Product;

public interface ProductJpaRepository extends JpaRepository<Product,Integer> 
{

}
