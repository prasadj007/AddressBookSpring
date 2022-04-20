package com.bridgelabz.AddressBookSpring.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class AddressBookDTO {

    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}",message = "Enter Valid Name")
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipcode;
    public long mobile_no;
    public String email;

    public AddressBookDTO(String firstName, String lastName, String address, String city, String state, String zipcode, long mobile_no, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.mobile_no = mobile_no;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", mobile_no=" + mobile_no +
                ", email='" + email + '\'' +
                '}';
    }
}
