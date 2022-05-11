package com.travel.busyflights.domain.crazyair;

public class CrazyAirResponse {
	
	private String airline;
    private double price;
    private String cabinclass;
    private String departureAirportCode;
    private String destinationAirportCode;
    private String departureDate;
    private String arrivalDate;
    
    public CrazyAirResponse() {
    }
    
    private CrazyAirResponse(Builder builder) {
        this.airline = builder.airline;
        this.price = builder.price;
        this.cabinclass = builder.cabinclass;
        this.departureAirportCode = builder.departureAirportCode;
        this.destinationAirportCode = builder.destinationAirportCode;
        this.departureDate = builder.departureDate;
        this.arrivalDate = builder.arrivalDate;
    }
    
    public static Builder newCrazyAirResponse() {
        return new Builder();
    }
    
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCabinclass() {
		return cabinclass;
	}
	public void setCabinclass(String cabinclass) {
		this.cabinclass = cabinclass;
	}
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
    
	public static final class Builder {
        private String airline;
        private Double price;
        private String cabinclass;
        private String departureAirportCode;
        private String destinationAirportCode;
        private String departureDate;
        private String arrivalDate;

        private Builder() {
        }

        public CrazyAirResponse build() {
            return new CrazyAirResponse(this);
        }

        public Builder airline(String airline) {
            this.airline = airline;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder cabinclass(String cabinclass) {
            this.cabinclass = cabinclass;
            return this;
        }

        public Builder departureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
            return this;
        }

        public Builder destinationAirportCode(String destinationAirportCode) {
            this.destinationAirportCode = destinationAirportCode;
            return this;
        }

        public Builder departureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }

        public Builder arrivalDate(String arrivalDate) {
            this.arrivalDate = arrivalDate;
            return this;
        }
    }
    
}
