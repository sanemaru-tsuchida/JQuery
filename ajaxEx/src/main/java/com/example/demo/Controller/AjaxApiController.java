package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkemail")
public class AjaxApiController {
	@ResponseBody
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public Map<String,String> check(String email){
		Map<String,String> map =new HashMap<>();
		String duplicateMessage = null;
		System.out.println(email);
		if("abc@gmail.com".equals(email)) {
			duplicateMessage = "「"+email+"」は既に登録されているメールアドレスです。";
		}else {
			duplicateMessage = "「"+email+"」は登録されていません。";
		}
			
		map.put("duplicateMessage", duplicateMessage);
		return map;
	}
}
