package com.example.centralPortal.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FeignConfig {
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}

