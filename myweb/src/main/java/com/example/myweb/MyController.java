package com.example.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")			//주소창에 localhost:8089/ 입력하면
	public String indexPage() {
		return "index";			// index.html 파일을 열어라
	}
	@GetMapping("/oper")		// localhost:8089/oper
	public String oper(Model model, @RequestParam("num1") String num) {
		String msg = "";
		int age = Integer.parseInt(num);
		if(age >= 20) {
			msg = "성인 입니다.";
		}
		else if(age >= 14) {
			msg = "청소년 입니다.";
		}
		else {
			msg = "어린이 입니다.";
		}
		
			
		model.addAttribute("result",msg);
		return "oper";			// oper.html 열어라
		
	}


}
