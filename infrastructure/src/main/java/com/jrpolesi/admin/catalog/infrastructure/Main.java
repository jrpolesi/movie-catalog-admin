package com.jrpolesi.admin.catalog.infrastructure;

import com.jrpolesi.admin.catalog.infrastructure.configuration.WebServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

//        LOG.info("[step:to-be-init] [id:1] Inicializando o Spring");
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "development");
        SpringApplication.run(WebServerConfig.class, args);
//        LOG.info("[step:inittialized] [id:2] Spring inicializado..");
    }
}