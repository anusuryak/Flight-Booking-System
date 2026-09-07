package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entity.AirportEntity;

public interface AirportRepository extends JpaRepository<AirportEntity,Integer>{

	
}
