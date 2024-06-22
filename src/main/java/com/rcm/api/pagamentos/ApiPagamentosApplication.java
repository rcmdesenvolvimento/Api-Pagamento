package com.rcm.api.pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiPagamentosApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiPagamentosApplication.class, args);
    }

}

// Gerar Mock
// https://designer.mocky.io
