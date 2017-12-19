package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class producerController {
	@RequestMapping(value = "/check/{id}",method=RequestMethod.GET)
	@ResponseBody
	public PersonToCheck check(PersonToCheck personToCheck,@PathVariable Integer id,HttpServletRequest request) {
		
		personToCheck.setName(request.getRequestURI().toString());
		personToCheck.setAge(33);
		personToCheck.setId(Long.valueOf(id));
		return personToCheck;
	} 

}
