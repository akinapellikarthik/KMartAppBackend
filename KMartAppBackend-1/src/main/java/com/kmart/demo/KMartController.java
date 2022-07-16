package com.kmart.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/kmart")
public class KMartController {

    //TODO: Need to add Swagger documentation
    @GetMapping("/healthcheck")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("I am alive", HttpStatus.OK);
    }
}
