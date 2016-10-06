package com.seed.beans;

import java.util.HashSet;
import java.util.LinkedList;

//TODO:0	Modification required
public class ShoppingCart {
	private java.util.Collection<Integer> productIds;	

	public ShoppingCart() {
//		TODO:1 Create object of LinkedList,
//		which will be referred using member variable "productIds"
		productIds = new LinkedList<Integer>();
	}	
	
	public java.util.Set<Integer> getProductSet() {
//		TODO:2 return set of product ids stored in this shopping cart
		
		return new HashSet<Integer>(productIds);
	}

	public void setProductList(String[] newProductIds) {
//		TODO:3	add newProductIds into existing list of product ids
		for(String id : newProductIds){
			productIds.add(Integer.parseInt(id));
		}
		
	}	
}
