package com.naver.myhome.RedirectAttributes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class RedirectController {
	
	@RequestMapping(value="/delete") // http://localhost:8088/myhome3/delete 1. 수행
	public String delete(HttpSession session) {
		session.setAttribute("message", "삭제되었습니다.");
		return "redirect:/output";   // http://localhost:8088/myhome3/output 2. 수행 요청
	}
	
	@RequestMapping(value="/output") // http://localhost:8088/myhome3/output 3. 수행
	public String output() {
		return "redirect/output";
	}
	
	@RequestMapping(value="/delete2") // http://localhost:8088/myhome3/delete2 1. 수행
	public String delete2(RedirectAttributes rattr) {
		// addFlashAttribute()는 일회성으로 데이터를 전달합니다.
		rattr.addFlashAttribute("message", "삭제되었습니다.");
		return "redirect:/output2";   // http://localhost:8088/myhome3/output2 2. 수행 요청
	}
	
	@RequestMapping(value="/output2") // http://localhost:8088/myhome3/output2 3. 수행
	public String output2() {
		return "redirect/output2";
	}
	
	@RequestMapping(value="/delete3") 
	public String delete3(RedirectAttributes rattr) {
		rattr.addFlashAttribute("message", "삭제되었습니다.");
		
		//redirect의 파라미터로 보냅니다.
		//http://localhost:8088/myhome3/output3?attr=addAttribute
		rattr.addAttribute("attr", "addAttribute");
		return "redirect:/output3";   
	}
	
	@RequestMapping(value="/output3") 
	public String output3() {
		return "redirect/output3";
	}
	
}