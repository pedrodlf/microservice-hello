package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

@RestController()
public class TestController {
	
	private static Log log = LogFactory.getLog(TestController.class);

	
	
	@GetMapping("hello")
	public ResponseEntity<String> hello(){
		log.info("Request SessionID : {}"+RequestContextHolder.currentRequestAttributes().getSessionId());
		return new ResponseEntity<String>("Hello People",HttpStatus.OK);
	}
	
}
