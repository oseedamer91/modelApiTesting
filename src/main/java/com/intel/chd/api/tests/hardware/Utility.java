package com.intel.chd.api.tests.hardware;

public class Utility implements Item {
	
	private String bios;
	private String cpu;
	private String swImage;
	
	public Utility(String bios, String cpu, String swImage) {
		super();
		this.bios = bios;
		this.cpu = cpu;
		this.swImage = swImage;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getSwImage() {
		return swImage;
	}

	public void setSwImage(String swImage) {
		this.swImage = swImage;
	}
	

	
}
