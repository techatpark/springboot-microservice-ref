package org.springboot.microservice.productsearch;

import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
public class DiscoveryClientController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/service")
    public Optional<URI> serviceUrl(@Param("serviceName") String serviceName) {

        return discoveryClient.getInstances(serviceName)
                .stream()
                .findFirst()
                .map(si -> si.getUri());
    }


    @GetMapping("/getInstances")
    public List<URI> getServiceInstances(@Param("serviceName") String serviceName) {

        return discoveryClient.getInstances(serviceName).stream().map(instance -> instance.getUri()).collect(Collectors.toList());
    }

}
