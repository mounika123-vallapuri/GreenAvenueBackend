package com.spring.model;

import javax.persistence.*;

@Entity
@Table(name="Supplier")
public class Supplier 
{
	@Id
	int SupId;
	
	String SupName,SupDesc;

	public int getSupId() {
		return SupId;
	}

	public void setSupId(int SupId) {
		this.SupId = SupId;
	}

	public String getSupName() {
		return SupName;
	}

	public void setSupName(String SupName) {
		this.SupName = SupName;
	}

	public String getSupDesc() {
		return SupDesc;
	}

	public void setSupDesc(String SupDesc) {
		this.SupDesc = SupDesc;
	}
	
	
}
