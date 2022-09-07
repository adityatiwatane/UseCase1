package com.aditya.service;

import com.aditya.model.Person;

import java.util.*;

public interface ContactService {

    Person save(Person contact);

    Optional<Person> findContactById(Long id);

}
