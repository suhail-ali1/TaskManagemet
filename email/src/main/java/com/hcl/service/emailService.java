package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hcl.Entity.EmailDetails;
import com.hcl.Repository.emailRepo;

@Service
public class emailService {

	@Autowired private JavaMailSender javaMailSender;
	@Autowired emailRepo repo;
	 
    @Value("${spring.mail.username}") private String sender;
 
    // Method 1
    // To send a simple email
    public EmailDetails sendSimpleMail(EmailDetails details)
    {
  
            // Creating a simple mail message
            SimpleMailMessage mailMessage
                = new SimpleMailMessage();
 
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());
 
            // Sending the mail
            javaMailSender.send(mailMessage);
           return repo.saveAndFlush(details);
          
    }
}
	

