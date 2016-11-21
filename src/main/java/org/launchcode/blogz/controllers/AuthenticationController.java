package org.launchcode.blogz.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.blogz.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {		
		return "newpost";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signupForm() {
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup() {
		return "redirect:blog/newpost";
	}
	
	
}	