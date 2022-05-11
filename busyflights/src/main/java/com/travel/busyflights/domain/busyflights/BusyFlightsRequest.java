package com.travel.busyflights.domain.busyflights;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.travel.busyflights.validators.DateValidator;

@DateValidator
public class BusyFlightsRequest {
	
	@Size(min = 3, max = 3)
	private String origin;
	
	@Size(min = 3, max = 3)
    private String destination;
    
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String departureDate;
	
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String returnDate;
	
	@Range(min = 1, max = 4)
    private int numberOfPassengers;
    
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
    
    
}
