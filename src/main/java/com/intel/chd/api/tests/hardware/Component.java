package com.intel.chd.api.tests.hardware;

public class Component implements Item {
	
	private String brand;
	private String compType;
	
	
	public Component(String brand, String compType) {
		super();
		this.brand = brand;
		this.compType = compType;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCompType() {
		return compType;
	}
	public void setCompType(String compType) {
		this.compType = compType;
	}
	
	

}
