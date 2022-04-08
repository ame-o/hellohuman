package com.americao.hellohumanpathvariables.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloHumanController {
		@RequestMapping("")
		public String index(@RequestParam(value="q") String nameQuery) {
				return "Hello " + nameQuery;
		}

		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors!";
		}
		
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";		
		}
	}

