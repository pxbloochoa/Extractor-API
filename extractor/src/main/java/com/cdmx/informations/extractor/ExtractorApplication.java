package com.cdmx.informations.extractor;

import com.cdmx.informations.extractor.controller.ExtractorController;
import com.cdmx.informations.extractor.interfaceServices.IMetrobusDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.cdmx.informations.extractor"})
public class ExtractorApplication implements  CommandLineRunner{


	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	ExtractorController extractorController;


	public static void main(String[] args) {
		SpringApplication.run(ExtractorApplication.class, args);


	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}



	@Override
	public void run(String ... args){
		System.out.println("inicia--------------------");
		extractorController.getDataLocation(restTemplate);
		System.out.println("Termina--------------------");
	}


}
