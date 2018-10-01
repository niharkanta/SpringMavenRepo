package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.LoginBean;

@Controller
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value="/redirectLoginPage", method=RequestMethod.GET)
	public String directLoginPage(){
		logger.info("********** Redirecting to Login Page **********");
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView doLogin(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("loginInfo")LoginBean loginInfo){
		System.out.println("Login Info:");
		System.out.println("id:"+loginInfo.getId()+" password:"+loginInfo.getPassword());
		logger.info("********** Login Successful **********");
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("userName", loginInfo.getName());
		return mav;
		
	}
}
