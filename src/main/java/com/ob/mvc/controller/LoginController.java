package com.ob.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ob.mvc.service.LoginService;

@Controller
public class LoginController {
	
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap mp)
	{
		//mp.addAttribute("name", name);
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcome(ModelMap mp, @RequestParam String name, @RequestParam String password)
	{
		
		boolean validUser = loginService.isValidUser(name, password);
		if(!validUser) return "login";
		
		mp.addAttribute("name", name);
		mp.addAttribute("password", password);
		
		return "welcome";
	}
	
}
