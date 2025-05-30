package com.contactapp.controller;

import com.contactapp.entity.Contact;
import com.contactapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;
@PostMapping("/save-contact")
    ResponseEntity<Contact> createContact(@RequestBody Contact contact){
        Contact saveContact=contactService.createContact(contact);
        return new ResponseEntity<>(saveContact, HttpStatus.CREATED);
    }

}
