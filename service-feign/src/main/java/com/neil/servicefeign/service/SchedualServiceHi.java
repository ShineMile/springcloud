package com.neil.servicefeign.service;

import com.neil.servicefeign.hystrix.FeignHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello", fallback = FeignHystrixService.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
