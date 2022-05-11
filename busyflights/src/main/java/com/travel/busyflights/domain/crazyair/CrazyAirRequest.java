package com.travel.busyflights.domain.crazyair;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class CrazyAirRequest {
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
    private int passengerCount;
    
    public CrazyAirRequest() {
    }
    
    private CrazyAirRequest(Builder builder) {
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureDate = builder.departureDate;
        this.returnDate = builder.returnDate;
        this.passengerCount = builder.passengerCount;
    }
    
    public static Builder newCrazyAirRequest() {
        return new Builder();
    }
    
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
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
    
	public static final class Builder {
        private String origin;
        private String destination;
        private String departureDate;
        private String returnDate;
        private Integer passengerCount;

        private Builder() {
        }

        public CrazyAirRequest build() {
            return new CrazyAirRequest(this);
        }

        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder departureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public Builder returnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder passengerCount(Integer passengerCount) {
            this.passengerCount = passengerCount;
            return this;
        }

    }
}
