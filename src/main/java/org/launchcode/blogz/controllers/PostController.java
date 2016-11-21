package org.launchcode.blogz.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {
	
	@RequestMapping(value="/blog/newpost", method=RequestMethod.GET)
	public String newPostForm() {
		return "newpost";
	}
	
	@RequestMapping(value="/blog/newpost", method=RequestMethod.POST)
	public String newPost(HttpServletRequest request, Model model) {
		String username = request.getParameter("title");
		String postId = request.getParameter("body");
		
		model.addAttribute("username", username);
		model.addAttribute("postId", postId);
		return "/blog/{username}/{postId}";
	}
	
//	@RequestMapping(value = "/blog/{username}/{postId}", method = RequestMethod.GET)
//	public String singlePost(@PathVariable String username, @PathVariable int postId, Model model) {
//	    return "post";
//	}
	

}
