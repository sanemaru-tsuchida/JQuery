package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class AjaxEx2ApiController {
	@RequestMapping(value = "/check1",method=RequestMethod.POST)
	public Map<String,String> check1(String passSize,String conPass){
		Map<String, String> map = new HashMap<>();
		String passSizeChaek = null;
		String conPassChaek = null;
		if(passSize.length()<=7) {
			passSizeChaek = "パスワードは8文字以上で入力してください";
		}else {
			passSizeChaek = "パスワード入力OK!";
		}
		if(passSize.length() >=8) {
			if(passSize.equals(conPass) ) {
				conPassChaek = "確認用パスワードOK!";
			}else {
				conPassChaek = "パスワードが一致してません";

			}
		}
		
		map.put("passSize", passSizeChaek);
		map.put("conPass", conPassChaek);
		return map;
		
	}
}
