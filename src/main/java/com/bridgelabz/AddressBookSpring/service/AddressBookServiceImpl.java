package com.bridgelabz.AddressBookSpring.service;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import com.bridgelabz.AddressBookSpring.entity.AddressBookData;
import com.bridgelabz.AddressBookSpring.exception.AddressBookException;
import com.bridgelabz.AddressBookSpring.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService{

   @Autowired
   private AddressBookRepository addressBookRepository;
   //private List<AddressBookData> addressBookList=new ArrayList<>();


   @Override
   public List<AddressBookData> getAddressBookData() {
      return addressBookRepository.findAll();
   }


   public AddressBookData getAddressBookById(long personId) {
      return addressBookRepository.findById(personId).orElseThrow(()->new AddressBookException("Person with this ID doesnt exists"));
   }

   @Override
   public AddressBookData addNewContact(AddressBookDTO addressBookDTO) {
      AddressBookData addressBookData=null;
      addressBookData=new AddressBookData(addressBookDTO);
      return addressBookRepository.save(addressBookData);
   }

   @Override
   public AddressBookData updateContact(long personId,AddressBookDTO addressBookDTO) {
      AddressBookData addressBookData=this.getAddressBookById(personId);
      addressBookData.updateContact(addressBookDTO);
      return addressBookRepository.save(addressBookData);
   }

   @Override
   public void deleteContact(long personId) {
      AddressBookData addressBookData=this.getAddressBookById(personId);
      addressBookRepository.delete(addressBookData);
   }


}
