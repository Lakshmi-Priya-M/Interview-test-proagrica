package com.travel.busyflights.domain.toughjet;

public class ToughJetResponse {
	private String carrier;
    private double basePrice;
    private double tax;
    private double discount;
    private String departureAirportName;
    private String arrivalAirportName;
    private String outboundDateTime;
    private String inboundDateTime;
    
    public ToughJetResponse() {
    	super();
    }
    
    private ToughJetResponse(Builder builder) {
        super();
        this.carrier = builder.carrier;
        this.basePrice = builder.basePrice;
        this.tax = builder.tax;
        this.discount = builder.discount;
        this.departureAirportName = builder.departureAirportName;
        this.arrivalAirportName = builder.arrivalAirportName;
        this.outboundDateTime = builder.outboundDateTime;
        this.inboundDateTime = builder.inboundDateTime;
    }
    
    public static Builder newToughJetResponse() {
        return new Builder();
    }
    
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getDepartureAirportName() {
		return departureAirportName;
	}
	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}
	public String getArrivalAirportName() {
		return arrivalAirportName;
	}
	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}
	public String getOutboundDateTime() {
		return outboundDateTime;
	}
	public void setOutboundDateTime(String outboundDateTime) {
		this.outboundDateTime = outboundDateTime;
	}
	public String getInboundDateTime() {
		return inboundDateTime;
	}
	public void setInboundDateTime(String inboundDateTime) {
		this.inboundDateTime = inboundDateTime;
	}
    
    
	 public static final class Builder {
	        private String carrier;
	        private Double basePrice;
	        private Double tax;
	        private Double discount;
	        private String departureAirportName;
	        private String arrivalAirportName;
	        private String outboundDateTime;
	        private String inboundDateTime;
	        
	        private Builder() {
	        }
	        
	        public ToughJetResponse build() {
	            return new ToughJetResponse(this);
	        }
	        
	        public Builder carrier(String carrier) {
	            this.carrier = carrier;
	            return this;
	        }

	        public Builder basePrice(Double basePrice) {
	            this.basePrice = basePrice;
	            return this;
	        }

	        public Builder tax(Double tax) {
	            this.tax = tax;
	            return this;
	        }

	        public Builder discount(Double discount) {
	            this.discount = discount;
	            return this;
	        }

	        public Builder departureAirportName(String departureAirportName) {
	            this.departureAirportName = departureAirportName;
	            return this;
	        }

	        public Builder arrivalAirportName(String arrivalAirportName) {
	            this.arrivalAirportName = arrivalAirportName;
	            return this;
	        }
	        
	        public Builder outboundDateTime(String outboundDateTime) {
	            this.outboundDateTime = outboundDateTime;
	            return this;
	        }

	        public Builder inboundDateTime(String inboundDateTime) {
	            this.inboundDateTime = inboundDateTime;
	            return this;
	        }
	        
	 }
	
}
