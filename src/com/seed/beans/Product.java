package com.seed.beans;

import java.util.Map;

import com.seed.util.ProductsRepository;

//TODO:0	Modification required
abstract public class Product implements ProductsRepository{
	private int id;
	private String name;
	private double price;
	
//	TODO:1	Provide no-argument public constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
//	TODO:2	Provide getters and setters for all attributes.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Map<Integer, Product> getProductEntries() {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}
