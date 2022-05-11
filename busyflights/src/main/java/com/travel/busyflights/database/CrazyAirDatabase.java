package com.travel.busyflights.database;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.travel.busyflights.domain.crazyair.CrazyAirResponse;

@Component
public class CrazyAirDatabase {
	
	public static List<CrazyAirResponse> crazyAirJetDatabase = new LinkedList<>();
	
	static {
		crazyAirJetDatabase.add(CrazyAirResponse.newCrazyAirResponse().airline("Ryanair")
                .departureAirportCode("STN")
                .destinationAirportCode("SVQ")
                .departureDate("2019-04-04")
                .arrivalDate("2019-04-09")
                .cabinclass("E").price(180.50).build());
		
		crazyAirJetDatabase.add(CrazyAirResponse.newCrazyAirResponse().airline("Vueling")
                .departureAirportCode("STN")
                .destinationAirportCode("SVQ")
                .departureDate("2019-04-04")
                .arrivalDate("2019-04-09")
                .cabinclass("B").price(380.50).build());
		
		crazyAirJetDatabase.add(CrazyAirResponse.newCrazyAirResponse().airline("British Airways")
				.departureAirportCode("CCC")
                .destinationAirportCode("DDD")
                .departureDate("2019-04-04")
                .arrivalDate("2019-04-09")
                .cabinclass("B").price(580.50).build());
	}
	
}
