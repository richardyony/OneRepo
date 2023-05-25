package com.megasoft.crudsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class CrudsbApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudsbApplication.class, args);
	}
@GetMapping(path="/")
	public List<String> getnames(){
		return List.of(
				"Chris",
				"Daniela",
				"Ricardo"


		);
	}//fin de metodo

}//finde clase
