package org.hzero.train.htanouath;

import org.hzero.autoconfigure.oauth.EnableHZeroOauth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHZeroOauth
public class HtanOuathApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtanOuathApplication.class, args);
    }

}
