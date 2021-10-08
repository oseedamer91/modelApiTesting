package com.intel.chd.api.tests.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wifiModel")
public class Wifi extends Model {
	
	public Wifi(String platformType) {
		this.platformType = platformType;
		this.modelType = "WIFI";
	}
}
