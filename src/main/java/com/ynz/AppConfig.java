package com.ynz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class AppConfig {

    //SpEL expression
    @Value("#{${valuesMap}}")
    private Map<String, String> valuesMap;

    @Bean
    public Map<String, String> getValues() {
        return valuesMap;
    }
}
