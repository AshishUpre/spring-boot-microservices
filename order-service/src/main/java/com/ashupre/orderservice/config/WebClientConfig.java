package com.ashupre.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    /**
     * @Loadbalanced is must for this to work
     */
    @Bean
    @LoadBalanced // now uses client side load balancing to connect to a service from discovery server list of addresses
    public WebClient.Builder webClient() {
        return WebClient.builder();
    }
}
