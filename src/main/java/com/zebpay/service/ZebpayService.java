package com.zebpay.service;

import com.zebpay.domain.Zebpay;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/coin")
public interface ZebpayService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @RequestMapping(method = RequestMethod.GET,path ="/getBitcoinPrices")
    ResponseEntity<Zebpay> getLatestPrices();
}
