package com.flightBooking.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.entity.FlightEntity;
import com.flightBooking.repository.FlightRepository;
import com.flightBooking.serviceinterface.FlightServiceInterface;
@Service
public class FlightServiceImplements implements FlightServiceInterface {
	@Autowired
	private FlightRepository repo;

	@Override
	public FlightEntity addFlight(FlightEntity entity) {
		return repo.save(entity);
	}

	@Override
	public List<FlightEntity> getallflight() {
		return repo.findAll();
	}

	@Override
	public FlightEntity getflightbyid(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public FlightEntity updateflight(Integer id,FlightEntity flight) {
		FlightEntity existing = repo.findById(id).get();
		
		existing.setPassengername(flight.getPassengername());
		existing.setCity(flight.getCity());
		existing.setFlightid(flight.getFlightid());
		
		return repo.save(existing);
				
	}

	@Override
	public void deleteflight(Integer id) {
		repo.deleteById(id);
	}

	
	
	
	
	
}
