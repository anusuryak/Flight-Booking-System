package com.flightBooking.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.flightBooking.entity.AirportEntity;
import com.flightBooking.entity.FlightEntity;

public interface FlightServiceInterface {
	//void addFlight();
	//void getbyid();
	//void updateflight();
	//void deleteflight();

	FlightEntity addFlight(FlightEntity entity);
	List<FlightEntity> getallflight();
	FlightEntity getflightbyid(Integer id);

	FlightEntity updateflight(Integer id, FlightEntity flight);

	void deleteflight(Integer id);
	



	
}
