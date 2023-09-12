package com.hcl.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.Entity.EmailDetails;
import com.hcl.service.emailService;

@RestController
@RequestMapping("email")
@CrossOrigin
public class emailController {

	@Autowired emailService service;
	
	@PostMapping("/sendotp")
	public EmailDetails sendotp(@RequestBody EmailDetails email)
	{
		return service.sendSimpleMail(email);
	}
	
}
