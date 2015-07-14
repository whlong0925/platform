package com.sinmo.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.common.collect.Maps;
import com.sinmo.model.User;
import com.sinmo.service.IUserService;
@Controller
@RequestMapping(value = "/user")
public class UserController {

	private static Map<String, String> allStatus = Maps.newHashMap();

	static {
		allStatus.put("enabled", "有效");
		allStatus.put("disabled", "无效");
	}
	@Resource
	private IUserService userService;
	 
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(@RequestParam String id){
		User user = new User();
		user.setUsername("test");
		user.setUsercode("testusercode");
		user.setDeptId(1);
		this.userService.saveUser(user);
		System.out.println(id);
		return "users/index";
	}

	
}