/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.microservice.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ProductApiController {
    
    @GetMapping("/api/products/{id}")
    public Mono<String> hello(@PathVariable String id) {
        return Mono.just("I am a Product " + id);
    } 
    
    @GetMapping("/api/products/myendpoint/{id}")
    public Mono<String> hello1(@PathVariable String id) {
        return Mono.just("I am a Product my endpoint" + id);
    } 
     
//    @PostMapping("/restart/{env}")
//    public void restart(@PathVariable("env") String env) {
//        Application.restart(env);
//    } 
}