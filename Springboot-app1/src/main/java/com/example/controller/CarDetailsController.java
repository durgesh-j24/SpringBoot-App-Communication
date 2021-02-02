package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cardetails;
import com.example.services.CarService;

@RestController
public class CarDetailsController {
	
	
	@Autowired
	private CarService servicecar;
	
	@GetMapping("/")
	public String message() {
		
		return "welcome to spring boot";
	}
	
	@GetMapping("/cardetails/{id}")
	public Cardetails getCardetails(@PathVariable int id){
		return this.servicecar.getCarDetails(id);	
	}
	
	@PostMapping("/cardetails")
	public Cardetails addCardetails(@RequestBody Cardetails car) {
		
		return this.servicecar.addCarDetails(car);
	}
}
