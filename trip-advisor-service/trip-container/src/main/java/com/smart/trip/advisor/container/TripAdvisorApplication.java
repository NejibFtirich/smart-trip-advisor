package com.smart.trip.advisor.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.smart.trip.advisor")
public class TripAdvisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TripAdvisorApplication.class, args);
    }
}
