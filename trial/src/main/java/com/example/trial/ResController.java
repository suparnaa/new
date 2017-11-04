package com.example.trial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ResController {

	
	
	@RequestMapping(value="/result", method = RequestMethod.GET)
	public ModelAndView res(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/result");
		return modelAndView;
	}

	@RequestMapping(value="/rules", method = RequestMethod.GET)
	public ModelAndView rule(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/rules");
		return modelAndView;
	}
	

}
