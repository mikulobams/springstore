package com.zollo.springstore;

import com.zollo.springstore.domain.Product;
import com.zollo.springstore.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringstoreApplication.class, args);
    }

}
