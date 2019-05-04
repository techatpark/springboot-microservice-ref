/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springboot.microservice.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController("/api/stores")
public class StoreApiController {
    
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/call_product")
    public Mono<String> helloProduct() {
        Mono<String> pres = webClientBuilder.build().get().uri("http://product-service/api/products").retrieve().bodyToMono(String.class);
        return pres;
    }

    @GetMapping()
    public Mono<String> hello() {
        return Mono.just("I am a Store");
    }

//    @PostMapping("/restart/{env}")
//    public void restart(@PathVariable("env") String env) {
//        Application.restart(env);
//    } 
}
