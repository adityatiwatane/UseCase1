package com.aditya.service;

import com.aditya.model.Contact;

import java.util.List;

public interface ContactService {

    Contact save(Contact contact);

    Contact findContactById(Long id);

}
