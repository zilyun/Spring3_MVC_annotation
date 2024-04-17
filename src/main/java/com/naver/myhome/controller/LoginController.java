package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import model.BbsBean;

/*
 * 1. @Controller 애노테이션을 사용한 컨트롤러 클래스를 이용해서 특정 요청 URL을 처리합니다.
 * 2. @Component를 상속한 @Controller는 @Controller가 붙은 클래스의 객체를 메모리에 생성하는 기능을 제공합니다.
 * 3. 단순히 객체를 생성하는 것에 그치지 않고 DispatcherServlet이 인식하는 Controller 객체로 만들어 줍니다.
 * 4. 스프링 컨테이너는 @Controller가 선언된 객체를 자동으로 Controller 객체로 인식합니다.
 * */

@Controller
public class LoginController {
	/*
	 * 1. @RequestMapping 애노테이션을 사용해서 메서드에 처리할 요청 경로를 지정합니다.
	 * 		value="요청 경로", method는 전송 방식 지정합니다.
	 * 
	 * 2. @RequestMapping 뒤에는 반드시 메서드가 나와야 하고 자동 호출 됩니다.
	 * 
	 * 3. 메서드 이름은 다른 메서드들과 중복되지 않게만 작성합니다.
	 * 
	 * 4. post방식과 get방식을 모두 적용할 경우에는 
	 * 	  method={RequestMethod.POST, RequestMethod.GET} 또는 생략합니다.
	 * */
	// http://localhost:8088/myhome/login
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public String login() {
		return "login/loginForm"; // WEB-INF/views/login/loginForm.jsp 이곳으로 이동해라
	}
	
	
	//@RequestMapping(value = "/login_ok1.do", method=RequestMethod.POST)
	public ModelAndView login_ok(HttpServletRequest request, ModelAndView mv) {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		BbsBean bbs = new BbsBean();
		bbs.setId(id);
		bbs.setPass(pass);
		
		mv.setViewName("login/list"); // WEB-INF/views/login/list.jsp
		mv.addObject("bkey", bbs);
		/*
		 * addObject의 첫 번째 매개변수는 키(Key), 두 번째 매개변수는 값(Value)을 의미합니다.
		 * bbs는 id와 비밀번호가 저장되어 있는 VO 객체입니다.
		 * ModelAndView에 값을 저장한 것은 WEB-INF/views/login/list.jsp에서 EL로 나타낼 수 있습니다.
		 * ID : ${bkey.id} <br>
		 * 비밀번호 : ${bkey.pass} <br>
		 * */
		return mv;
		/*
		 * WEB-INF/views/login/list.jsp의 내용이 보이지만 포워딩되어 주소는 
		 * http://localhost:8088/myhome3/login_ok1.do를 나타냅니다.
		 * 리다이렉트를 원하면 'redirect:'라는 접두사를 붙입니다.
		 * */
	}
	
	/*
	 * Model 이용해서 데이터 전달 방법
	 * ① View 페이지에 대한 정보는 반환형 String 에 나타냅니다.
	 * 		위와 같은 결과를 얻습니다.
	 * */
	@RequestMapping(value = "/login_ok1.do", method=RequestMethod.POST)
		public String login_ok1(HttpServletRequest request, Model mv) {
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			
			BbsBean bbs = new BbsBean();
			bbs.setId(id);
			bbs.setPass(pass);
			
			mv.addAttribute("bkey", bbs);

			return "login/list";
		}
}
