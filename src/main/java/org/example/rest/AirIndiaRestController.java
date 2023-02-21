package org.example.rest;

import org.example.request.PassengerInfo;
import org.example.response.TicketInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class AirIndiaRestController {

    @RequestMapping(method = RequestMethod.POST,params = "/bookFlightTicket")
    public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){
        TicketInfo ticketInfo=new TicketInfo();
        ticketInfo.setName(passengerInfo.getFname()+" "+passengerInfo.getLname());
        ticketInfo.setName(passengerInfo.getFrom());
        ticketInfo.setName(passengerInfo.getTo());
        ticketInfo.setTicketStatus("CONFIRMED");
        ticketInfo.setTicketPrice("4500.00 INR");
        ticketInfo.setJourneyDate(passengerInfo.getJourneyDate());
        return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
    }
}
