package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.BbsBean;


@Controller
public class LoginController2 {
	
	@RequestMapping(value="/login2", method = RequestMethod.GET)
	public String login2() {
		return "login/loginForm2";
	}
	
	@RequestMapping(value="/login_ok2.do", method = RequestMethod.POST)
	public String login_ok2(BbsBean bbs) { // BbsBean bbs - command 객체
		return "login/list2";
	}
}
