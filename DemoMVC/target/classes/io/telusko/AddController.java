package io.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public void add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		
		int sum = num1+num2;
		System.out.println("In Add" + sum);
	}

}
