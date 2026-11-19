package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "Home page";
	}
	
	@RequestMapping("/about")
	@ResponseBody
	public String about() {
		return "about page";
	}
}
