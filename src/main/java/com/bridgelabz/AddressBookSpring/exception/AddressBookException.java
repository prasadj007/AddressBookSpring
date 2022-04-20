package com.bridgelabz.AddressBookSpring.exception;

import org.springframework.http.HttpStatus;

public class AddressBookException extends RuntimeException{

    public AddressBookException(String message){
        super(message);
    }
}
