package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class producerController {
	@RequestMapping(value = "/check/{id}",method=RequestMethod.GET)
	@ResponseBody
	public PersonToCheck check(PersonToCheck personToCheck,@PathVariable Integer id) {
		personToCheck.setName("wang");
		personToCheck.setAge(33);
		personToCheck.setId(Long.valueOf(id));
		System.out.println("2222222");
		return personToCheck;
	} 

}
