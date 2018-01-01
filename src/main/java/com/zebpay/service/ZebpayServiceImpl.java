package com.zebpay.service;

import com.zebpay.domain.Zebpay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZebpayServiceImpl implements ZebpayService {
    private Logger log = LoggerFactory.getLogger(ZebpayServiceImpl.class);

    @Override
    public ResponseEntity<Zebpay> getLatestPrices() {
        RestTemplate client = new RestTemplate();
        String url = "https://www.zebapi.com/api/v1/market/ticker/btc/inr";
        return new ResponseEntity<Zebpay>(client.getForObject(url,Zebpay.class),HttpStatus.OK);
    }
}
