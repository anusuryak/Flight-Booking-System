package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightBooking.entity.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity,Integer>{
	
}
