package com.kmart.demo.controller;

import com.kmart.demo.annotations.ValidProduct;
import com.kmart.demo.dto.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/kmart")
public class KMartController {

    //TODO: Need to add Swagger documentation
    //TODO: Accept a payload and do the Spring AOP Validation to accept it
    @GetMapping("/healthcheck")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("I am alive", HttpStatus.OK);
    }

    //TODO: Add Swagger Documentation
    //TODO: Handle 404 and other status codes
    @PostMapping("/item")
    @ValidProduct
    public ResponseEntity<Product> processItem(@RequestBody Product product){
        return new ResponseEntity<>(null,HttpStatus.OK);
    }
}
