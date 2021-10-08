package com.intel.chd.api.tests.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intel.chd.api.tests.model.Model;
import com.intel.chd.api.tests.repo.DocsisRepository;
import com.intel.chd.api.tests.repo.MocaRepository;
import com.intel.chd.api.tests.repo.WifiRepository;


@RestController
@RequestMapping("/")
public class DeviceController {
	
	
	@Autowired DocsisRepository docsisRepository;
	@Autowired MocaRepository mocaRepository;
	@Autowired WifiRepository wifiRepository;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	// ------- CRUD ----------
	// get all models
	// get model by id
	// update model
	// delete model
	
	
	@GetMapping("models")
	public List<Model> getAllModel(){
		return null;
		
	}
	
	
}
