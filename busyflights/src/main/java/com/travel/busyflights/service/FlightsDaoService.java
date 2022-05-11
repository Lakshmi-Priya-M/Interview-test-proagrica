package com.travel.busyflights.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.travel.busyflights.database.*;
import com.travel.busyflights.domain.busyflights.*;
import com.travel.busyflights.domain.crazyair.CrazyAirRequest;
import com.travel.busyflights.domain.crazyair.CrazyAirResponse;
import com.travel.busyflights.domain.toughjet.*;

@Component
public class FlightsDaoService {
	
	private static List<BusyFlightsResponse> busyFlightsResponse = new ArrayList<>();
	
	
	public List<BusyFlightsResponse> findall(){
		return busyFlightsResponse;
	}
	
	
	public List<ToughJetResponse> toughJetSearch(ToughJetRequest toughJetRequestDTO ){
        List<ToughJetResponse> response =
        		ToughJetDataBase.toughJetDatabase.stream()
                        .filter(r -> r.getDepartureAirportName().equals(toughJetRequestDTO.getFrom()))
                        .filter(r -> r.getArrivalAirportName().equals(toughJetRequestDTO.getTo()))
                        .filter(r -> r.getInboundDateTime().equals(toughJetRequestDTO.getInboundDate()))
                        .filter(r -> r.getOutboundDateTime().equals(toughJetRequestDTO.getOutboundDate()))
                        .collect(Collectors.toList());
        
        return  response;
        
    }


	public List<CrazyAirResponse> CrazyAirJetSearch(CrazyAirRequest crazyAirRequest) {
		List<CrazyAirResponse> response = 
				CrazyAirDatabase.crazyAirJetDatabase.stream()
					.filter(r -> r.getDepartureDate().equals(crazyAirRequest.getDepartureDate()))
	                .filter(r -> r.getArrivalDate().equals(crazyAirRequest.getReturnDate()))
	                .filter(r -> r.getDepartureAirportCode().equals(crazyAirRequest.getOrigin()))
	                .filter(r -> r.getDestinationAirportCode().equals(crazyAirRequest.getDestination()))
	                .collect(Collectors.toList());
	
		return response;
	}
	
	public List<BusyFlightsResponse> BusyFlightsSearch(BusyFlightsRequest busyFlightsRequest) {
		List<BusyFlightsResponse> response = new LinkedList<>();
		
		List<CrazyAirResponse> crazyAirResponses = 
				CrazyAirDatabase.crazyAirJetDatabase.stream()
					.filter(r -> r.getDepartureDate().equals(busyFlightsRequest.getDepartureDate()))
	                .filter(r -> r.getArrivalDate().equals(busyFlightsRequest.getReturnDate()))
	                .filter(r -> r.getDepartureAirportCode().equals(busyFlightsRequest.getOrigin()))
	                .filter(r -> r.getDestinationAirportCode().equals(busyFlightsRequest.getDestination()))
	                .collect(Collectors.toList());
		
		for(CrazyAirResponse crazyAirResponse : crazyAirResponses) {
			BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
			busyFlightsResponse.setAirline(crazyAirResponse.getAirline());
			busyFlightsResponse.setArrivalDate(crazyAirResponse.getArrivalDate());
			busyFlightsResponse.setDepartureDate(crazyAirResponse.getDepartureDate());
			busyFlightsResponse.setDepartureAirportCode(crazyAirResponse.getDepartureAirportCode());
			busyFlightsResponse.setDestinationAirportCode(crazyAirResponse.getDestinationAirportCode());
			busyFlightsResponse.setSupplier("CrazyAir");
			busyFlightsResponse.setFare(crazyAirResponse.getPrice());
			response.add(busyFlightsResponse);
		}
		
		List<ToughJetResponse> toughJetResponses =
        		ToughJetDataBase.toughJetDatabase.stream()
                        .filter(r -> r.getDepartureAirportName().equals(busyFlightsRequest.getOrigin()))
                        .filter(r -> r.getArrivalAirportName().equals(busyFlightsRequest.getDestination()))
                        .filter(r -> r.getInboundDateTime().equals(busyFlightsRequest.getDepartureDate()))
                        .filter(r -> r.getOutboundDateTime().equals(busyFlightsRequest.getReturnDate()))
                        .collect(Collectors.toList());
		
		for(ToughJetResponse toughJetResponse : toughJetResponses) {
			BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
			busyFlightsResponse.setAirline(toughJetResponse.getCarrier());
			busyFlightsResponse.setArrivalDate(toughJetResponse.getInboundDateTime());
			busyFlightsResponse.setDepartureDate(toughJetResponse.getOutboundDateTime());
			busyFlightsResponse.setDepartureAirportCode(toughJetResponse.getDepartureAirportName());
			busyFlightsResponse.setDestinationAirportCode(toughJetResponse.getArrivalAirportName());
			busyFlightsResponse.setSupplier("toughJet");
			busyFlightsResponse.setFare(toughJetResponse.getBasePrice() * (100-toughJetResponse.getDiscount())/100 + toughJetResponse.getTax());
			response.add(busyFlightsResponse);
		}
	
		return response;
	}
	
	
}
