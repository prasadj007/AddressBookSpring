package com.bridgelabz.AddressBookSpring.controller;


import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import com.bridgelabz.AddressBookSpring.dto.ResponseDTO;
import com.bridgelabz.AddressBookSpring.entity.AddressBookData;
import com.bridgelabz.AddressBookSpring.service.AddressBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @RequestMapping(value={"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        log.info("Inside the Controller");
        List<AddressBookData> addressBookList=null;
        addressBookList=addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("All Contact List",addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId)
    {
        AddressBookData addressBookData=null;
        addressBookData=addressBookService.getAddressBookById(personId);
        ResponseDTO responseDTO=new ResponseDTO("Get Call For ID",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> addNewContact(@RequestBody AddressBookDTO addressBookDTO){
            AddressBookData addressBookData=null;
            addressBookData=addressBookService.addNewContact(addressBookDTO);
            ResponseDTO responseDTO= new ResponseDTO("User Registered Successfully",addressBookDTO);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateContact(@PathVariable ("personId") long peronId, @RequestBody AddressBookDTO addressBookDTO)
    {
        AddressBookData addressBookData=null;
        addressBookData=addressBookService.updateContact(peronId,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("Updated Successfully",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/deletecontact/{personId}")
    public ResponseEntity<String> deleteContact(@PathVariable ("personId") int personId){
        addressBookService.deleteContact(personId);
        return new ResponseEntity<String>("DeletedContact"+personId,HttpStatus.OK);
    }
}