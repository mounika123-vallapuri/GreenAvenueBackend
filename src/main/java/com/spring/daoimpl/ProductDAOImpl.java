package com.spring.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ProductDAO;
import com.spring.model.Product;


@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
    SessionFactory sessionFactory;
    
	
    public ProductDAOImpl(SessionFactory sessionFactory) {
this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean addProduct(Product product) {
		
    	try
        {
            sessionFactory.getCurrentSession().save(product);
            return true;
        }
        catch(Exception e)
        {
        return false;
        }
		
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public List<Product> retrieveProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}




