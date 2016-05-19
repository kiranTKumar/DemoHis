package main.java.org.demoSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoSprigController {

	@RequestMapping("/")
	public ModelAndView returnPath(){
		return new ModelAndView("index");
	}
}
