package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RequestMapping("cloudsample-82268862.cepg-aa.kubepia.net")
@RequestMapping("/")
@RestController
public class CLRestController {
	
	@GetMapping(value = "/api/v1/user")
	public ResponseEntity<String> getUserIdNum() {
		try {
			return new ResponseEntity<String>("82268862", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
