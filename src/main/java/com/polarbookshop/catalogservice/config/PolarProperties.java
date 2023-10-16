package com.polarbookshop.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author brandon
 * @date 16/10/2023
 */
@ConfigurationProperties(prefix = "polar")
public class PolarProperties {

    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
