package com.travel.busyflights.validators;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.travel.busyflights.domain.busyflights.BusyFlightsRequest;

public class DateValidatorImpl implements ConstraintValidator<DateValidator, BusyFlightsRequest>{
	public final static String ISO8601 = "yyyy-MM-dd";
	
	 @Override
     public void initialize(DateValidator constraint) {
     }
	 
	@Override
	public boolean isValid(BusyFlightsRequest value, ConstraintValidatorContext context) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ISO8601);
	        LocalDate departureDate = LocalDate.parse(value.getDepartureDate(), formatter);
	        LocalDate returnDate = LocalDate.parse(value.getReturnDate(), formatter);
            return returnDate.isAfter(departureDate);
        } catch (Exception e) {
            // log error
            return false;
        }
	}

}
