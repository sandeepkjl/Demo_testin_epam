package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean("bean2")
    public RestTemplate restTemplate(){
       return new RestTemplate();
    }

    @Bean("bean1")
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
