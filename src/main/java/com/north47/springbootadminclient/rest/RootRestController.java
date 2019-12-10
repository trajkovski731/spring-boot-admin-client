package com.north47.springbootadminclient.rest;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class RootRestController {

    @GetMapping
    @Cacheable("root")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }
}
