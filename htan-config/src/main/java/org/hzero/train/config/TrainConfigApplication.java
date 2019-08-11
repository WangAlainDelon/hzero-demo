package org.hzero.train.config;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;

@EnableHZeroConfig
@EnableDiscoveryClient
@SpringBootApplication(exclude = ConfigServerAutoConfiguration.class)
public class TrainConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainConfigApplication.class, args);
    }
}
