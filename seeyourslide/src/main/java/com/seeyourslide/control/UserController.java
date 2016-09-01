package com.seeyourslide.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seeyourslide.model.User;

@Controller
public class UserController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String findAll(){
		return "index";
	}
}
