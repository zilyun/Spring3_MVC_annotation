package com.naver.myhome.Json;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.BbsBean;

@RestController // ResponseBody + @Controller
public class JsonRestController {
	
	// 반환형이 스트링이고 @ResponseBody가 있으면 문자열을 응답으로 보냅니다.
	// @ResponseBody
	@RequestMapping(value = "/url33")
	public String url33() {
		return "리턴되는 문자열이 주소에 대한 정보가 아니라 응답으로 보내 브라우저에 보입니다.";
	}
	
	// http://localhost:8088/myhome3/url55
	// {"id":"hta","pass":"like"}
	// @ResponseBody
	@RequestMapping(value = "/url55")
	public BbsBean url55() {
		BbsBean bean = new BbsBean();
		bean.setId("hta");
		bean.setPass("like");
		return bean;
	}
	
}
