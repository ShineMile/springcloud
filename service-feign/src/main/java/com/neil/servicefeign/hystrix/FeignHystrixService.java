package com.neil.servicefeign.hystrix;

import com.neil.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class FeignHystrixService implements SchedualServiceHi {
    @Override
    public String sayHelloFromClientOne(String name) {
        return name+",sorry,something is error";
    }
}
