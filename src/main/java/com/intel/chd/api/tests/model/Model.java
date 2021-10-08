package com.intel.chd.api.tests.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Model extends Platform {
	
	protected int id;
	protected String modelType;
	protected String macAddress;
	
	
	
	public String getModelType() {
		return modelType;
	}
	
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	
}
