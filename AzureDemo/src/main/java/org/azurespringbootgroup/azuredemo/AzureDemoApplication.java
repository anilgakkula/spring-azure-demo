package org.azurespringbootgroup.azuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class AzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return "Welcome to Azure Demo Portal";
    }
    public static void main(String[] args) {
        SpringApplication.run(AzureDemoApplication.class, args);
    }

}
