package com.example.springbootdemo.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author cj34920
 * Date: 2018/05/18
 */
@RestController
public class TestController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/test")
    public String hello() {
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        logger.info("hello,host" + serviceInstance.getHost() + ", server_id" + serviceInstance.getServiceId());
        return "Hello World";
    }
}
