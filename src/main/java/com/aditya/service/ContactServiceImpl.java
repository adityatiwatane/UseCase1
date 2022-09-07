package com.aditya.service;

import com.aditya.model.Person;
import com.aditya.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Person save(Person contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Person findContactById(Long id) {

        try {
            if (contactRepository.findById(id) == null) {
                return null;
            } 
                return contactRepository.findById(id);
        } catch(Exception e) {

        }

    }


}
