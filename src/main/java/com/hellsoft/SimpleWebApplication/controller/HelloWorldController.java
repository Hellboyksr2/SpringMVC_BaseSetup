package com.hellsoft.SimpleWebApplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
		
    private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
	 public String rootController() {
		logger.debug("This is the Root Controller");
		return "redirect:/hello";
	 }
    
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	 public ModelAndView hello() {
		logger.debug("This is the Hello Controller");
		return new ModelAndView("index").addObject("test", "Kumar");
	 }
}
