package com.appone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	@Column(name="pro_id")
	private int id;
	@Column(name="pro_name")
	private String productName;
	@Column(name="pro_qty")
	private int qty;
	@Column(name="pro_price")
	private int price;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product(int id, String productName, int qty, int price, Customer customer) {
		super();
		this.id = id;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.customer = customer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
