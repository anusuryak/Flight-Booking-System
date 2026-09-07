package com.flightBooking.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.entity.AirportEntity;
import com.flightBooking.repository.AirportRepository;
import com.flightBooking.serviceinterface.AirportServiceInterface;

@Service
public class AirportServiceImplements implements AirportServiceInterface{
	@Autowired
	public AirportRepository repo;

	@Override
	public AirportEntity addairport(AirportEntity entity) {
		return repo.save(entity);
		
	}

	@Override
	public List<AirportEntity> getallairport() {
		return repo.findAll();
	}

	@Override
	public AirportEntity getairportbyid(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public AirportEntity updateairport(Integer id, AirportEntity airport) {

	    AirportEntity existingAirport = repo.findById(id).get();

	    existingAirport.setAirportName(airport.getAirportName());
	    existingAirport.setCity(airport.getCity());
	    existingAirport.setAirportCode(airport.getAirportCode());

	    return repo.save(existingAirport);
	}

	@Override
	public void deleteairport(Integer id) {
		repo.deleteById(id);
	}

	



}
