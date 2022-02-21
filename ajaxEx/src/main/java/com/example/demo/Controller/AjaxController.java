package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkemail")
public class AjaxController {
	@RequestMapping("")
	public String index() {
		return "input_email";
	}
}
