package com.example.paymentservicesep24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceSep24Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceSep24Application.class, args);
    }

}
