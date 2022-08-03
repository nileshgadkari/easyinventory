package com.nilesh.easyinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyInventoryApplication.class, args);
        System.out.println("To trigger build");
    }

}
