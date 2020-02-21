package org.decembrist.controller;

import org.decembrist.dto.UserDto;
import org.decembrist.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<UserDto> findAll() {
		return userService.findAll();
	}

	@GetMapping("/kotlin")
	public String helloKotlin() {
		return "NO KOTLIEN";
	}
}
