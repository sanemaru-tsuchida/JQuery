package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex3")
public class AjaxEx3Controller {
	@RequestMapping("")
	public String idex() {
		return "stutas";
	}
}
