package com.travel.busyflights.domain.toughjet;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class ToughJetRequest {

	@Size(min = 3, max = 3)
	private String from;
	
	@Size(min = 3, max = 3)
    private String to;
    
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String outboundDate;
    
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String inboundDate;
    
    @Range(min = 1, max = 4)
    private int numberOfAdults;
    
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getOutboundDate() {
		return outboundDate;
	}
	public void setOutboundDate(String outboundDate) {
		this.outboundDate = outboundDate;
	}
	public String getInboundDate() {
		return inboundDate;
	}
	public void setInboundDate(String inboundDate) {
		this.inboundDate = inboundDate;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
}
