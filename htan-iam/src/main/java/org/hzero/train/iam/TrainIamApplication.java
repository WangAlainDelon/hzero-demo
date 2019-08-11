package org.hzero.train.iam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHZeroIam
public class TrainIamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainIamApplication.class, args);
    }

}
