package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex3")
public class AjaxEx3ApiController {
	@RequestMapping(value = "/check",method = RequestMethod.POST)
	public Map<String,String> check(String stutasNext,String stutas){
		Map<String,String> map =new HashMap<>();
		String stutasChack = null;
		String stutasNextChack = null;
		if("入金前へ変更".equals(stutasNext)) {
			stutasNextChack = "配送済みへ変更";
			stutasChack = "入金済み";
		}else if("配送済みへ変更".equals(stutasNext)) {
			stutasNextChack = "完了へ変更";
			stutasChack ="配送済み";
		}else if("完了へ変更".equals(stutasNext)) {
			stutasNextChack = "入金前へ変更";
			stutasChack ="完了";
		}
		map.put("stutasNext", stutasNextChack);
		map.put("stutas", stutasChack);
		return map;
	}
	
}
