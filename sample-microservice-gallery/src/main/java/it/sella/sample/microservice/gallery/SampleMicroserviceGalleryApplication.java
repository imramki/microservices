package it.sella.sample.microservice.gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableFeignClients("it.sella.sample.microservice.gallery")
public class SampleMicroserviceGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroserviceGalleryApplication.class, args);
	}

}

@Configuration
class RestTemplateConfig {

	// Create a bean for restTemplate to call services
	@Bean
	//@LoadBalanced        // Load balance between service instances running at different ports.
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

