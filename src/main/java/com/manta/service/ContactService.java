package com.manta.service;

import com.manta.model.Contact;

import java.util.List;

public interface ContactService {

    Contact save(Contact contact);

    Contact findContactById(Long id);

}
