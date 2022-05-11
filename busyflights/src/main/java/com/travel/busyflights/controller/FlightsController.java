package com.travel.busyflights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travel.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travel.busyflights.domain.crazyair.CrazyAirRequest;
import com.travel.busyflights.domain.crazyair.CrazyAirResponse;
import com.travel.busyflights.domain.toughjet.ToughJetRequest;
import com.travel.busyflights.domain.toughjet.ToughJetResponse;
import com.travel.busyflights.service.FlightsDaoService;

@RestController
public class FlightsController {
	
	@Autowired
	private FlightsDaoService flightsDaoService;
	
	@RequestMapping(value = "/toughjet/search", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    public List<ToughJetResponse> search(@RequestBody final ToughJetRequest toughJetRequest) {
        return flightsDaoService.toughJetSearch(toughJetRequest);
    }
	
	@RequestMapping(value = "/crazyairjet/search", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    public List<CrazyAirResponse> search(@RequestBody final CrazyAirRequest crazyAirRequest) {
        return flightsDaoService.CrazyAirJetSearch(crazyAirRequest);
    }
	
	@RequestMapping(value = "/busyflights/search", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    public List<BusyFlightsResponse> search(@RequestBody final BusyFlightsRequest busyFlightsRequest) {
        return flightsDaoService.BusyFlightsSearch(busyFlightsRequest);
    }
	
}
