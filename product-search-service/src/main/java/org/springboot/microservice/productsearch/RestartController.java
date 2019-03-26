/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.microservice.productsearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class RestartController {
    
    @GetMapping("/")
    public Mono<String> hello() {
        return Mono.just("Hi Welcome to SEARCH 3.0");
    } 
     
    @PostMapping("/restart/{env}")
    public void restart(@PathVariable("env") String env) {
        Application.restart(env);
    } 
}