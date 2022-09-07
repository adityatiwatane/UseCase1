package com.aditya.service;

import com.aditya.model.Person;

import java.util.List;

public interface ContactService {

    Person save(Person contact);

    Person findContactById(Long id);

}
