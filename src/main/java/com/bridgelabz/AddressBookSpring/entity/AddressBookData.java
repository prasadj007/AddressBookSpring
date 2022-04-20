package com.bridgelabz.AddressBookSpring.entity;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="addressbooksys")
public @Data class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private long mobile_no;
    private String email;

    public AddressBookData() {

    }


    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateContact(addressBookDTO);
    }

    public void updateContact(AddressBookDTO addressBookDTO) {
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
