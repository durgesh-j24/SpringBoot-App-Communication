package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Cardetails;

public interface CarRepository extends JpaRepository<Cardetails, Integer> {

}
