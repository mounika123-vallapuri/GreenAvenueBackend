package com.spring.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.SupplierDAO;
import com.spring.model.Supplier;

@SuppressWarnings("deprecation")
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean addSupplier(Supplier supplier) 
	{
		try
		{
		Session session=sessionFactory.getCurrentSession();
		session.save(supplier);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		return false;
		}
	}

	public List<Supplier> retrieveSupplier() 
	{
		Session session=sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		Query query=session.createQuery("from Supplier");
		@SuppressWarnings({ "unchecked" })
		List<Supplier> listSupplier=query.list();
		session.close();
		return listSupplier;
	}

	@Transactional
	public boolean deleteSupplier(Supplier Supplier) 
	{	
		try
		{
		Session session=sessionFactory.getCurrentSession();
		session.delete(Supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);	
		return false;
		}
	}

	public Supplier getSupplier(int SupId) 
	{
		Session session=sessionFactory.openSession();
		Supplier Supplier=(Supplier)session.get(Supplier.class,SupId);
		session.close();
		return Supplier;
	}

	@Transactional
	public boolean updateSupplier(Supplier Supplier) 
	{
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(Supplier);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}
	
}
