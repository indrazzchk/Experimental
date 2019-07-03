package com.example.controllers;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, value="/helloworld")
	
	@ResponseBody
	  public String getResponse() {
	  return "Hello World";
	}

}
