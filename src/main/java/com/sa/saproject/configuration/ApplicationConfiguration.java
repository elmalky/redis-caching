package com.sa.saproject.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "app")
public class ApplicationConfiguration {

    private final Redis redis = new Redis();

    @Data
    public static class Redis{
        private long timeoutSeconds;
        private int redisPort;
        private String redisHost;
        // Mapping of cacheNames to expira-after-write timeout in seconds
        private Map<String, Long> cacheExpirations = new HashMap<>();
    }
}