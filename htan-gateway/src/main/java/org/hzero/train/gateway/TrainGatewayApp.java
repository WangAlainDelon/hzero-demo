package org.hzero.train.gateway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableHZeroGateway
@EnableDiscoveryClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TrainGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(TrainGatewayApp.class, args);
    }
}