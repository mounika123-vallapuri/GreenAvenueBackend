package com.spring.test;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.spring.dao.SupplierDAO;
import com.spring.model.Supplier;

@Ignore
public class SupplierTest 
{
	static SupplierDAO SupplierDAO;
	
	@BeforeClass
	public static void initialize()
	{
		@SuppressWarnings("resource")
		AnnotationConfigWebApplicationContext configApplnContext=new AnnotationConfigWebApplicationContext();
		configApplnContext.scan("com.spring");
		configApplnContext.refresh();
		
		//SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
		
		SupplierDAO=(SupplierDAO)configApplnContext.getBean("SupplierDAO");
	}
	@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupId(102);
		supplier.setSupName("Desktop");
		supplier.setSupDesc("all kinds of desktops ");
		
		assertTrue(SupplierDAO.addSupplier(supplier));
	}
	@Test
	public void updateSupplierTest()
	{
		Supplier Supplier=new Supplier();
		Supplier.setSupId(1002);
		Supplier.setSupName("JMShirt");
		Supplier.setSupDesc("John Miller Shirt with Best Price");
		
		assertTrue(SupplierDAO.updateSupplier(Supplier));
	}
	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier Supplier=new Supplier();
		Supplier.setSupId(1002);
		assertTrue(SupplierDAO.deleteSupplier(Supplier));
	}
	@Ignore
	@Test
	public void retrieveSupplierTest()
	{
		List<Supplier> listSupplier=SupplierDAO.retrieveSupplier();
		assertNotNull("Problem in Retriving ",listSupplier);
		this.show(listSupplier);
	}
	
	public void show(List<Supplier> listSupplier)
	{
		for(Supplier Supplier:listSupplier)
		{
			System.out.println("Supplier ID:"+Supplier.getSupId());
			System.out.println("Supplier Name:"+Supplier.getSupName());
		}
	}
	
	@Ignore
	@Test
	public void getSupplierTest()
	{
		Supplier Supplier=SupplierDAO.getSupplier(1001);
		assertNotNull("Problem in Getting:",Supplier);
		System.out.println("Supplier ID:"+Supplier.getSupId());
		System.out.println("Supplier Name:"+Supplier.getSupName());
		System.out.println("Supplier Description  = "+Supplier.getSupDesc());
	}

}







