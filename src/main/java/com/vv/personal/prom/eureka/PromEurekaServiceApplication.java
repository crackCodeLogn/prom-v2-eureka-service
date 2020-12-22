package com.vv.personal.prom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PromEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromEurekaServiceApplication.class, args);
    }

}
