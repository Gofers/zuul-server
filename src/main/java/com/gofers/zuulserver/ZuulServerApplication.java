package com.gofers.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 73956
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulServerApplication {



    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
