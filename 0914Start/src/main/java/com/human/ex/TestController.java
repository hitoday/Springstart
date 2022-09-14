package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public String view(Locale locale, Model model) {
		System.out.println("hello board");
		return "board/view";
	}
	
	@RequestMapping(value = "/board/hello", method = RequestMethod.GET)
	public String hello(Locale locale, Model model) {
		System.out.println("hello KIM");
		return "board/hello";
	}
	
	@RequestMapping("/board/inputIdPw")
	public String checkId(@RequestParam("id") String id
			,@RequestParam(value="pw", required=false, defaultValue="2") String pw, Model model){
//		null값을 허용하려면 required=false 입력해 주면 된다.
		model.addAttribute("idens",id);
		model.addAttribute("passs",pw);
	
		return "board/inputIdPw";
	}
}
	
