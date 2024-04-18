package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CheckController {
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check() {
		return "check/checkForm";
	}

	@RequestMapping(value = "/check.do", method = RequestMethod.POST)
	public String param2(String[] hobby, Model model) {
		model.addAttribute("hobby", hobby);		
		return "check/list1";
	}
}
