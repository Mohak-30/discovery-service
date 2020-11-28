package com.insee.servicediscovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class ServiceDiscovery {

    public static void main(String[] args) {
        log.debug("Starting service discovery");
        SpringApplication.run(ServiceDiscovery.class, args);
        log.debug("Service discovery started");
    }
}
