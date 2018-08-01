package com.appMatricula.appMatricula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class AppMatriculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMatriculaApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String index() {
		return "index";
	}
}