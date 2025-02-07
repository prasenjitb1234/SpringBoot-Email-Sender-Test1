package com.prasenjit.EmailSender.controller;

import com.prasenjit.EmailSender.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail(){
        sendEmailService.sendEmail("peterparker.dev.test.616@gmail.com","Test Body","Test Subject");
        return "Sent Successfully";
    }




}
