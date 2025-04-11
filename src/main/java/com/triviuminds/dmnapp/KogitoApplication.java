package com.triviuminds.dmnapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.triviuminds.dmnapp", "com_46triviuminds_46dmn", "org.kie.kogito.**", "http**"})
public class KogitoApplication {
    public static void main(String[] args) {
        SpringApplication.run(KogitoApplication.class, args);
    }
}
