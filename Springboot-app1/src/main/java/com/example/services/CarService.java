package com.example.services;

import com.example.model.Cardetails;

public interface CarService {

	public Cardetails getCarDetails(int id);
	public Cardetails addCarDetails(Cardetails cardetails);
}
