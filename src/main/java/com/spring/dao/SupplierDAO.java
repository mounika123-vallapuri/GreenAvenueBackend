package com.spring.dao;

import java.util.List;
import com.spring.model.Supplier;

public interface SupplierDAO 
{
	public boolean addSupplier(Supplier supplier);
	public List<Supplier> retrieveSupplier();
	public boolean deleteSupplier(Supplier Supplier);
	public Supplier getSupplier(int SupId);
	public boolean updateSupplier(Supplier Supplier);
}
