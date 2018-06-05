package com.aaa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Users;
import com.aaa.service.UsersService;


@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	UsersService service;
	
	@RequestMapping("/backLogin")
	@ResponseBody
	public int BackLogin(HttpSession session ,Users u){
		return service.checkUsers(u, session);
		
	}

}
