package com.codestates.todoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
@RestController
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@GetMapping("/hello")
	public String init(){

		return "hello";
	}

//	@GetMapping
//	public ResponseEntity<Map<String, String>> hello(){
//		Map<String, String> data = new HashMap<>();
//		data.put("text", "hello team 30");
//		data.put("id", "52");
//
//		Map<String, Object> map = new HashMap<>();
//		map.put("hello", data);
//
//		return new HashMap<>(map, )
//	}
}
