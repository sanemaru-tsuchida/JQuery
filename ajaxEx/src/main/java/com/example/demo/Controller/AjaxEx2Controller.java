package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex2")
public class AjaxEx2Controller {
	@RequestMapping("")
	public String index() {
		return "check_pass";
	}
}
