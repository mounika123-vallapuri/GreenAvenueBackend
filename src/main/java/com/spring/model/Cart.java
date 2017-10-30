package com.spring.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Cart implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	@GeneratedValue
	@Id
	int cartId;
	private int productId;
	private int userId;
	private double subTotal;
	private int price;
	private int productQuantity;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getUserId() {
		return userId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	String productName;

	
	
	
}