package com.sanjay.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/")
    public String myMsg() {
    	  return "This is my first rest controller";
    }
}
