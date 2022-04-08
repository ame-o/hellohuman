package com.americao.hellohumanpathvariables.controllers;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHumanController {
		@RequestMapping("")
		public String index(@RequestParam(value="q",required=false) String nameQuery) {
			if (nameQuery ==null) {
				return "Hello Human";
			}else {				
				return "Hello " + nameQuery;				
			}
		}

	}

