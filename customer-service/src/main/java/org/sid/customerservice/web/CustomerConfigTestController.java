package org.sid.customerservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class CustomerConfigTestController {
    @Value("${global.params.x}")
    private String x1;
    @Value("${global.params.x}")
    private String x2;
    @Value("${customer.params.x}")
    private String x3;
    @Value("${customer.params.x}")
    private String x4;
    @GetMapping("/params")
    public Map<String, String> params(){
        return Map.of("x1",x1,"x2",x2,"x3",x3,"x4",x4);
    }
}