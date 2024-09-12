package com.drevotiuk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Main class for the Config Server application.
 * 
 * This class sets up and starts a Spring Cloud Config Server,
 * which is responsible for serving configuration properties to other
 * microservices in a distributed system.
 * 
 * The application is annotated with {@link SpringBootApplication},
 * which marks it as a Spring Boot application, and {@link EnableConfigServer},
 * which enables the Config Server functionality.
 * 
 * <p>
 * To run the application, the main method invokes
 * {@link SpringApplication#run(Class, String...)}.
 * </p>
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

  /**
   * Main entry point of the Config Server application.
   *
   * @param args Command line arguments passed to the application.
   */
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}
