package com.travel.busyflights;

import static org.hamcrest.Matchers.not;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.travel.busyflights.domain.crazyair.CrazyAirRequest;
import com.travel.busyflights.domain.crazyair.CrazyAirResponse;
import com.travel.busyflights.service.FlightsDaoService;


@ComponentScan
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BusyFlightsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FlightsServiceTests {
	
	@Autowired
	private FlightsDaoService flightsService;
	
	private CrazyAirRequest crazyAirRequest;
	
	@Before
    public void setUp() throws Exception {
		crazyAirRequest =
				CrazyAirRequest.newCrazyAirRequest()
                        .passengerCount(4)
                        .origin("CCC")
                        .destination("DDD")
                        .departureDate("2019-04-04")
                        .returnDate("2019-04-09")
                        .build();
		
	}
	
	@Test
    public void crazyAirSearchTest() throws InterruptedException, ExecutionException {
        List<CrazyAirResponse> crazyAirResponse = flightsService.CrazyAirJetSearch(crazyAirRequest);

        Assert.assertNotNull(crazyAirResponse);
        Assert.assertEquals(crazyAirResponse, not(IsEmptyCollection.empty()));
    }
	
	
}
