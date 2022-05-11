package com.travel.busyflights.database;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.travel.busyflights.domain.toughjet.ToughJetResponse;


@Component
public class ToughJetDataBase {
	
	public static List<ToughJetResponse> toughJetDatabase = new LinkedList<>();
	
	static{
		toughJetDatabase.add(ToughJetResponse.newToughJetResponse().carrier("Ryanair")
                .basePrice(100.00).tax(20.0).discount(5.0)
                .departureAirportName("STN")
                .arrivalAirportName("SVQ")
                .inboundDateTime("2019-04-08")
                .outboundDateTime("2019-04-04")
                .build());
		toughJetDatabase.add(ToughJetResponse.newToughJetResponse().carrier("Vueling")
                .basePrice(300.00).tax(35.0).discount(1.0)
                .departureAirportName("STN")
                .arrivalAirportName("SVQ")
                .inboundDateTime("2019-04-08")
                .outboundDateTime("2019-04-04")
                .build());
		toughJetDatabase.add(ToughJetResponse.newToughJetResponse().carrier("British Airways")
                .basePrice(200.00).tax(40.0).discount(10.0)
                .departureAirportName("CCC").arrivalAirportName("DDD")
                .inboundDateTime("2019-04-04")
                .outboundDateTime("2019-04-09")
                .build());
	}
	
	

}
