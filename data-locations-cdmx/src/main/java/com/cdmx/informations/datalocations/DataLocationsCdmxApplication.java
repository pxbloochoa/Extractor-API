package com.cdmx.informations.datalocations;

import com.cdmx.informations.datalocations.repository.LocationRepository;
import com.cdmx.informations.datalocations.resolver.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.cdmx.informations.datalocations.controller"})
public class DataLocationsCdmxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataLocationsCdmxApplication.class, args);
	}

	@Bean
	public Query query(LocationRepository LocationRepository) {
		return new Query(LocationRepository);
	}


}



