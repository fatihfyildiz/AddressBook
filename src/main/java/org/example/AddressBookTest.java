package org.example;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {

    AddressBook addressBook = new AddressBook();


    @Test
    public void testAddContact(){
        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        addressBook.addContact(contact);
        addressBook.getAllContacts();
        assertTrue(addressBook.contactList.contains(contact));
    }

    @Test
    public void testRemoveContact(){
        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        addressBook.removeContact(contact);
        addressBook.getAllContacts();
        assertFalse(addressBook.contactList.contains(contact));

    }

    @Test
    public void testChangeContactNumber(){
        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        addressBook.addContact(contact);
        addressBook.changeContactNumber(contact,"12684898400");
        assertEquals("12684898400",contact.number.toString());
    }


}
