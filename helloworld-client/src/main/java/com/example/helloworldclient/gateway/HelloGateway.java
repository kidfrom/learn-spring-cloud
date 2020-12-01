package com.example.helloworldclient.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloGateway {

  @Bean
  public RouteLocator helloService(RouteLocatorBuilder builder) {
    return builder.routes()
            .route("getHello", r -> r.path("/hello")
                    .uri("lb://HELLO-SERVICE"))
            .build();
  }
}
