package com.intel.chd.api.tests.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "docsisModel")
public class Docsis extends Model {
	
	public Docsis(String platformType) {
		this.platformType = platformType;
		this.modelType = "DOCSIS";
	}
}
