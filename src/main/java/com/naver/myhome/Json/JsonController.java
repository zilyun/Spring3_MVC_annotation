package com.naver.myhome.Json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletResponse;
import model.BbsBean;

@Controller
public class JsonController {
	
	// http://localhost:8088/myhome3/url
	// 반환형이 스트링이면 이동할 페이지를 의미합니다.
	@RequestMapping(value = "/url")
	public String url() throws Exception {
		return "json/url1";
	}
	
	@RequestMapping(value = "/url2")
	public void url2(HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("[url2에서 보냅니다.]");
	}
	
	// 반환형이 스트링이고 @ResponseBody가 있으면 문자열을 응답으로 보냅니다.
	@ResponseBody
	@RequestMapping(value = "/url3")
	public String url3() {
		return "리턴되는 문자열이 주소에 대한 정보가 아니라 응답으로 보내 브라우저에 보입니다.";
	}
	
	@RequestMapping(value = "/url4")
	public void url4(HttpServletResponse response) throws Exception {
		BbsBean bean = new BbsBean();
		bean.setId("hta");
		bean.setPass("like");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().print(bean);
	}
	
	// http://localhost:8088/myhome3/url5
	// {"id":"hta","pass":"like"}
	@ResponseBody
	@RequestMapping(value = "/url5")
	public BbsBean url5()  {
		BbsBean bean = new BbsBean();
		bean.setId("hta");
		bean.setPass("like");
		return bean;
	}
	
}
