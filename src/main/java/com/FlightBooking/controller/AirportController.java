package com.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightBooking.entity.AirportEntity;
import com.flightBooking.serviceinterface.AirportServiceInterface;

@RestController
@RequestMapping("/airport")
public class AirportController {

	@Autowired
	public AirportServiceInterface service;
	
	@PostMapping("/addairport")
	public AirportEntity addairport(@RequestBody AirportEntity entity ) {
		return service.addairport(entity);
	}
	
	@GetMapping("/getairport")
	public List<AirportEntity> getairport() {
		return service.getallairport();
	}
	
	@GetMapping("/{id}")
	public AirportEntity getairportbyid(@PathVariable Integer id) {
		return service.getairportbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public AirportEntity updateairport(@PathVariable Integer id,@RequestBody AirportEntity entity) {
		return service.updateairport(id, entity);
	}
	
	@DeleteMapping("delete/{id}")
	public  String deletebooking(@PathVariable Integer id){
		service.deleteairport(id);
		return "airport delete successfully";
	}
	
	
}
