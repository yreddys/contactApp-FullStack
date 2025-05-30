package com.contactapp.service;

import com.contactapp.entity.Contact;
import com.contactapp.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepo contactrepo;

    public Contact createContact(Contact contact) {
        return contactrepo.save(contact);
    }
}
