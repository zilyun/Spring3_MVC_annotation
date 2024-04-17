package com.naver.myhome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.BbsBean;


//@Controller
public class LoginController2_설명 {
	
	@RequestMapping(value="/login2", method = RequestMethod.GET)
	public String login2() {
		return "login/loginForm2";
	}
	
	@RequestMapping(value="/login_ok2.do", method = RequestMethod.POST)
	public String login_ok2(BbsBean bbs) { // BbsBean bbs - command 객체
		
		/*
		 * command 객체란 ?
		 * 1. 스프링은 요청 파라미터의 값을 command 객체에 담아주는 기능을 제공합니다.
		 * 
		 * 2. command 객체에는 파라미터로 넘어온 값들을 저장할 setter 메서드가 존재하면 됩니다.
		 * 	  즉, 파라미터의 이름과 property의 이름이 같으면 됩니다.
		 * 	  예로 loginForm2.jsp 에서 <input type=text name=id> 에서 입력한 값을 저장하기 위해
		 * 	  setId() 메서드가 존재하면 됩니다.
		 * 
		 * 3. String id = request.getParameter("id");
		 * 	  String pass = request.getParameter("pass");
		 * 	
		 * 	  BbsBean bbs = new BbsBean();
		 * 	  bbs.setId(id);
		 * 	  bbs.setPass(pass);
		 * 
		 * 	  command 객체를 사용하면 위의 코드 기능을 수행하므로 위의 코드들은 필요 없게 됩니다.
		 * 
		 * 4. command 객체에 저장된 값을 JSP 에서 사용하기 위해서는 
		 * 	  ${bbsBean.id} 또는 ${bbsBean.pass}로 사용합니다.
		 *    즉, list2.jsp 에서 
		 *    command 객체의 클래스 이름(첫 글자를 소문자로 바꿉니다.)과 프러퍼티를 이용해서 출력하면 됩니다.
		 *    
		 *    예로 command 객체의 클래스 이름이 BbsBean인 경우 JSP 코드에서는 bbsBean 이라는 이름을 사용해서 
		 *    command 객페에 접근할 수 있게 됩니다.
		 * 
		 * */
		
		return "login/list2";
	}
}
