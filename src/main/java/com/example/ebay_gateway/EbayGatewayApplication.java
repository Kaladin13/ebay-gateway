package com.example.ebay_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class EbayGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbayGatewayApplication.class, args);
	}

}
