package com.bridgelabz.AddressBookSpring.service;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDTO;
import com.bridgelabz.AddressBookSpring.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService{

   private List<AddressBookData> addressBookList=new ArrayList<>();


   @Override
   public List<AddressBookData> getAddressBookData() {
      List<AddressBookData> contactList=new ArrayList<>();
      contactList.add(new AddressBookData(1,new AddressBookDTO("Arun","Sharma","karve-Nagar","Pune","Maharashtra","411052",8149498627L,"arun@gmail")));
      return addressBookList;
   }


   public AddressBookData getAddressBookById(int personId) {
      AddressBookData contactList=null;
      contactList=new AddressBookData(1,new AddressBookDTO("Arun","Sharma","Karve-Nagar","Pune","Maharashtra","Maharashtra",8149498627L,"bridge@gmail.com"));
      return contactList;
   }

   @Override
   public AddressBookData addNewContact(AddressBookDTO addressBookDTO) {
      AddressBookData addressBookData=null;
      addressBookData=new AddressBookData(1,addressBookDTO);
      return addressBookData;
   }

   @Override
   public AddressBookData updateContact() {
      return null;
   }

   @Override
   public void deleteContact() {

   }


}
