package com.livraria.bankaii.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.livraria.bankaii.Entity.Usuarios;

@Controller
public class WebController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    
	@GetMapping("/index")
    public ModelAndView index() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("home/index.html");
        return mv;
    }
	
//	@GetMapping
//	public String index(final Model model) {
//		model.addAttribute("user", new Usuarios());
//		
//		return "index";
//	}
//	
	@PostMapping
    @RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute ModelAndView mv) {
		return "login";
	}
	
//    @RequestMapping("login")
//    @GetMapping("/login")
//    public ModelAndView login() {
//    	ModelAndView mv = new ModelAndView();
//    	mv.setViewName("login.html");
//        return mv;
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @PostMapping("/login")
//    public ModelAndView login() {
//    	ModelAndView mv = new ModelAndView();
//    	mv.setViewName("home/login.html");
//        return mv;
//    }
//	
}