package com.vv.personal.prom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PromEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(PromEurekaServer.class, args);
    }

}
