package com.shoppingdac1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


	
	
@Controller
public class controller1 {
	
	
		@RequestMapping(value={"/home","/"}) 
		public ModelAndView entry() {

		    ModelAndView mv = new ModelAndView("index");
		   // mv.addObject("message","good good go");
		    return mv;
		}
		
		@RequestMapping("/registration") 
		public ModelAndView entry3() {

		    ModelAndView mv = new ModelAndView("registration");
		   // mv.addObject("message","good good go");
		    return mv;
		}

		@RequestMapping(value={"/login"}) 
		public ModelAndView entry2() {

		    ModelAndView mv = new ModelAndView("login");
		   // mv.addObject("message","good good go");
		    return mv;
		}

		
		@RequestMapping(value={"/model1"}) 
		public ModelAndView entry1() {

		    ModelAndView mv = new ModelAndView("model");
		   // mv.addObject("message","good good go");
		    return mv;
		}
}
