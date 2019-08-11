package org.hzero.train.htamswagger;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHZeroSwagger
public class TrainSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainSwaggerApplication.class, args);
    }
}