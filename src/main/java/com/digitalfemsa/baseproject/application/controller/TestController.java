package com.digitalfemsa.baseproject.application.controller;


import com.digitalfemsa.baseproject.domain.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value="/getTest")
    public ResponseEntity<String> getTest(){

        return new ResponseEntity<String>("Test ok",HttpStatus.ACCEPTED);
    }
}
