package com.health.app.branch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/branch/*")
public class BranchController {

	@GetMapping("branchtest")
	public String test() {
		return "branch/branchTest";
	}
}
