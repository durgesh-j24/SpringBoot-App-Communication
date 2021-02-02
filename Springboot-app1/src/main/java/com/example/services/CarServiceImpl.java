package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Cardetails;
import com.example.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepo;



	@Override
	public Cardetails getCarDetails(int id) {
		Cardetails car=carRepo.getOne(id);
		return car;
	}

	@Override
	public Cardetails addCarDetails(Cardetails cardetails) {
		return carRepo.save(cardetails);
	}

}
