package com.Name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class NameController {
	
	@GetMapping(value="/getName")	
	public String getName() {
		return "Vasanthakumar";
	}
}
