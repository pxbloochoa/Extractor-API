package com.cdmx.informations.extractor;

import com.cdmx.informations.extractor.controller.MetrobusDataController;
import com.cdmx.informations.extractor.controller.TownHallDataController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@Slf4j
@ConfigurationProperties("app.config")
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.cdmx.informations.extractor"})
public class ExtractorApplication implements  CommandLineRunner{

	//@Value("${app.config.scheduler}")


	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	MetrobusDataController extractorController;

	@Autowired
	TownHallDataController townHallDataController;

	public static void main(String[] args) {
		SpringApplication.run(ExtractorApplication.class, args);


	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}



	@Override
	public void run(String ... args){

	}

	@Scheduled(fixedRateString = "${time.scheduled}")
	public void Tasks(){
		log.info("Starting Task Extract Data Location from metrobus");
		extractorController.getDataLocation(restTemplate);
		log.info("Terminated Task Extract Data Location from metrobus");
		log.info("Starting Task Extract To Data Town Hall");
		townHallDataController.getDataLocation(restTemplate);
		log.info("Terminated Task Extract To Data Town Hall");

	}


}
