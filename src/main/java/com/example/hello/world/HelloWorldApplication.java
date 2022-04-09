package com.example.hello.world;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
@RequestMapping("/hola")
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping("/{saludo}")
	//lo que esta dentro del parentesis de pathVariable tiene que estar igual que el
	//{saludo} de la variable path no es necesario agregar el name= en @páthVariable y tambien puedes omitir los
	//parentesis y tomaria directamente el nombre de la variable como name del path variable
	public String saludo(@PathVariable(name ="saludo") String saludo){
		log.info("Variable Saludo :" + saludo);
		return saludo+" new";
	}

}
