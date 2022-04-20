package com.bridgelabz.AddressBookSpring.repository;

import com.bridgelabz.AddressBookSpring.entity.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Long> {
}
