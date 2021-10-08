package com.intel.chd.api.tests.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mocaModel")
public class Moca extends Model {

	public Moca(String platformType) {
		this.platformType = platformType;
		this.modelType = "MOCA";
	}
	
	
}
