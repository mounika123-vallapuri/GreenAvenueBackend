package com.spring.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
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
@Ignore
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
@Ignore
	public List<Product> retrieveProducts() {
		// TODO Auto-generated method stub
		return null;
	}
@Ignore
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
@Ignore
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}




