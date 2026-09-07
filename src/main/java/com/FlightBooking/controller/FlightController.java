package com.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightBooking.entity.FlightEntity;
import com.flightBooking.serviceinterface.FlightServiceInterface;

@RestController
@RequestMapping("/flight")
public class FlightController {
	@Autowired
	private FlightServiceInterface service;
	
	@PostMapping("/addflight")
	public FlightEntity addflight(@RequestBody FlightEntity entity) {
		return service.addFlight(entity);
	}
	
	@GetMapping("/getflight")
	public List<FlightEntity> getflightbyid() {
		return service.getallflight();
	}
	
	@GetMapping("/{id}")
	public FlightEntity getflightbyid(@PathVariable Integer id) {
		return service.getflightbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public FlightEntity updateflight(@PathVariable Integer id,@RequestBody FlightEntity entity) {
		return service.updateflight(id, entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteflight(@PathVariable Integer id) {
		service.deleteflight(id);
		return "flight deleted successfully";
	}
}
