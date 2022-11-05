package com.livraria.bankaii.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)    
	@GetMapping("/index")
    public ModelAndView index() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("home/index.html");
        return mv;
    }
	
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv2 = new ModelAndView();
		mv2.setViewName("login.html");
		return mv2;
	}
	
	@RequestMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mv3 = new ModelAndView();
		mv3.setViewName("menu.html");
		return mv3;
	}
	
//	@PostMapping
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login(@ModelAttribute ModelAndView mv) {
//		return "login";
//	}
	
    
    

}