package org.example;


import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<Contact> contactList= new ArrayList<>();

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public void removeContact(Contact contact){
        contactList.remove(contact);
    }

    public List<Contact> getAllContacts(){
        System.out.println(contactList.toString());
        return contactList;
    }

    public void changeContactNumber(Contact contact,String newNumber){
        contact.changeNumber(newNumber);
        if (contactList.contains(contact)){
            System.out.println("The number of the " + contact.name + " has been changed as " + newNumber);
        } else {
            System.out.println("Invalid contact");
        }
    }
}
