/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.microservice.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/api/products")
public class ProductApiController {
    
    @GetMapping()
    public Mono<String> hello() {
        return Mono.just("I am a Product");
    } 
     
//    @PostMapping("/restart/{env}")
//    public void restart(@PathVariable("env") String env) {
//        Application.restart(env);
//    } 
}