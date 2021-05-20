package com.dwa.portada.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/portada")
	public String Portada() {
		return "home/portada";
	}
}
