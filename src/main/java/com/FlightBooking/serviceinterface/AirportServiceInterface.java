package com.flightBooking.serviceinterface;

import java.util.List;

import com.flightBooking.entity.AirportEntity;

public interface AirportServiceInterface {
 //void addairport();
//void getairportbyid();
  //void updateairport();
  //void deleteairport();

 AirportEntity addairport(AirportEntity entity);
 List<AirportEntity> getallairport();

 AirportEntity getairportbyid(Integer id);

 AirportEntity updateairport(Integer id, AirportEntity airport);

 void deleteairport(Integer id);
 


  
}
