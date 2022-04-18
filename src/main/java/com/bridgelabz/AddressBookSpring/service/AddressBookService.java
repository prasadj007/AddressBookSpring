package com.bridgelabz.AddressBookSpring.service;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import com.bridgelabz.AddressBookSpring.entity.AddressBookData;

import java.util.List;

public interface AddressBookService {

    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookById(int Id);
    AddressBookData addNewContact(AddressBookDTO addressBookDTO);
    AddressBookData updateContact();
    void deleteContact();
}
