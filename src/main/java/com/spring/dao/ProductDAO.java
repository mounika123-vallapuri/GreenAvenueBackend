package com.spring.dao;

import java.util.List;
import com.spring.model.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product product);
	public List<Product> retrieveProduct();
	public boolean deleteProduct(int productId);
	public Product getProduct(int productId);
	public boolean updateProduct(Product product);
	public Product getItem(int productId);
	public List<Product> getAllProducts();
}
