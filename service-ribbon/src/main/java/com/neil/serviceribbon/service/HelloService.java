package com.neil.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name){
        return restTemplate.getForObject("http://service-hello/hello?name="+name, String.class);
    }
    public String error(String name ){
        return name+",调用出错啦！！！";
    }
}
