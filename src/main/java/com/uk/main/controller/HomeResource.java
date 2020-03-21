package com.uk.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	public HomeResource() {
		System.out.println("HomeResource.HomeResource()");
	}

	@GetMapping("/")
	public String homePage() {
		return ("<h1>Home Page</h1>");
	}
}
