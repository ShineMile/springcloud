package com.neil.servicefeign.controller;

import com.neil.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloContrller {
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @GetMapping("/hello")
    public String sayHello(String name){
        return schedualServiceHi.sayHelloFromClientOne(name);
    }
}
