package com.bridgelabz.AddressBookSpring.service;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import com.bridgelabz.AddressBookSpring.entity.AddressBookData;

import java.util.List;

public interface AddressBookService {

    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookById(long personId);
    AddressBookData addNewContact(AddressBookDTO addressBookDTO);
    AddressBookData updateContact(long personId,AddressBookDTO addressBookDTO);
    void deleteContact(long personId);
}
