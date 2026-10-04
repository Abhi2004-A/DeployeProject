package com.demo.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/democontrol")
public class DemoController {
	
	@GetMapping("/get1")
	public String demo1() {
		return "This is the Sentence 1";
	}
	
	@GetMapping("/get2")
	public String demo2() {
		return "This is the Sentence 2";
	}

}
