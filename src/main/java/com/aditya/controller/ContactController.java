package com.aditya.controller;

import com.aditya.model.Person;
import com.aditya.service.ContactService;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/contact/save")
    protected ResponseEntity<Person> save(@RequestBody Person contact) {
        Person _contact = contactService.save(contact);

        return new ResponseEntity<>(_contact, HttpStatus.CREATED);
    }

    @RequestMapping("/contact/retrieve/{id}")
    protected Person findById(@PathVariable Long id) {
        return contactService.findContactById(id);
    }


}
