package com.sushmita.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sushmita.DTO.LoginDTO;
import com.sushmita.Service.LoginService;

import sun.launcher.resources.launcher;

@Controller
public class LoginController {
	
	@Autowired
    private LoginService loginService;
	
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password) {
		System.out.println("hello");
		LoginDTO loginDto = new LoginDTO();
		ModelAndView modelAndView = new ModelAndView();
		loginDto.setUserId("1");
		loginDto.setUserName("sushmita@trisysit.com");
		loginDto.setName("sushmita");
		loginDto.setMobile("8971590182");
		loginService.save(loginDto);
		modelAndView.addObject("message", "hello developer");
	//	modelAndView.addObject("list", list);
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
