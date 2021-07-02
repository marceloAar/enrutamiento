//Marcelo Aceituno R
//Full Stack JAVA 0034
//Familiarizarnos con Enrutamiento
package com.infor.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {	
	
	    @RequestMapping("/coding")
	    public String coding(){
	      return "¡Hola Coding Dojo!";
	    }
	    @RequestMapping("/coding/python")
	    public String python(){
	      return "¡Python/Django fue increíble!";
	    }
	    @RequestMapping("/coding/java")
	    public String java(){
	      return "¡Java/Spring es mejor!";
	    }
}


