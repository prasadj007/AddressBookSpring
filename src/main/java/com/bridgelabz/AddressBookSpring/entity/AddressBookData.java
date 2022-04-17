package com.bridgelabz.AddressBookSpring.entity;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;

public class AddressBookData {

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private long mobile_no;
    private String email;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.firstName=addressBookDTO.firstName;
        this.lastName=addressBookDTO.lastName;
        this.address=addressBookDTO.address;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.zipcode=addressBookDTO.zipcode;
        this.mobile_no=addressBookDTO.mobile_no;
        this.email=addressBookDTO.email;
    }
}
