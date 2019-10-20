package com.sa.saproject;

import com.sa.saproject.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfiguration.class)
@EnableCaching
public class SaProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaProjectApplication.class, args);
    }
}


