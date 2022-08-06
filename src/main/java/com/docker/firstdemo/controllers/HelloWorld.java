package com.docker.firstdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.docker.firstdemo.pojo.MessageStyle;

@RestController
@RequestMapping("/docker")
public class HelloWorld {
	
	@RequestMapping(value = "/intro", method = RequestMethod.GET)
	public MessageStyle getMessage() {
		return new MessageStyle("Hello World");
	}

}
