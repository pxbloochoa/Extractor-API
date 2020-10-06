package com.cdmx.informations.datalocations.controller;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
//@RestController
//@RequestMapping("/api/station")
public class ControllerData {

	@Autowired
	private GraphQL graphQL;

	@SneakyThrows
	@PostMapping("/api/location")
	public ResponseEntity<Object> station (@RequestBody String query){
		JSONObject json = new JSONObject(query);
		log.info(json.getString("query"));
		ExecutionResult execute = graphQL.execute(ExecutionInput.newExecutionInput().query(json.getString("query")).build());
		return new ResponseEntity<>(execute,HttpStatus.OK);
	}

	@SneakyThrows
	@PostMapping("/api/townHall")
	public ResponseEntity<Object> townHall (@RequestBody String query){
		JSONObject json = new JSONObject(query);
		log.info(json.getString("query"));
		ExecutionResult execute = graphQL.execute(ExecutionInput.newExecutionInput().query(json.getString("query")).build());
		return new ResponseEntity<>(execute,HttpStatus.OK);
	}

}
