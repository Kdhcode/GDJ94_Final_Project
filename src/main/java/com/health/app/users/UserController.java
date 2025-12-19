package com.health.app.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/*")
public class UserController {

	@GetMapping("usertest")
	public String test() {
		return "users/userTest";
	}
}
