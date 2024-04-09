package org.example.call_rest_api_using_web_client;

import lombok.extern.slf4j.Slf4j;
import org.example.call_rest_api_using_web_client.dto.Products;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@SpringBootApplication
public class CallRestApiUsingWebClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(CallRestApiUsingWebClientApplication.class, args);

        // Define the URI for the products endpoint
        String uri = "https://fakestoreapi.com/products";

        // Create a WebClient builder
        WebClient.Builder builder = WebClient.builder();

        // Use the WebClient to send a GET request to the products endpoint
        // The response is expected to be a list of Products, so we use bodyToFlux to convert the response body to a Flux<Products>
        // The collectList method is used to convert the Flux to a Mono<List<Products>>
        // The block method is used to subscribe to the Mono and block until it completes, returning the resulting List<Products>
        List<Products> products = builder.build()
                .get()
                .uri(uri)
                .retrieve()
                .bodyToFlux(Products.class)
                .collectList()       /* Convert the Flux to a Mono<List<Products>> */
                .block();

        log.warn("-------------------");
        log.info("Response: {}", products);
        log.warn("-------------------");


        Products block = builder.build()
                .get()
                .uri(STR."\{uri}/1")
                .retrieve()
                .bodyToMono(Products.class)
                .block();


        log.warn("-------------------");
        log.info("Response: {}", block);
        log.warn("-------------------");

    }
}
