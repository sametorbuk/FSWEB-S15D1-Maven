package org.example.mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    public static ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;

        myContacts.add(new Contact("Bob", "31415926"));
        myContacts.add(new Contact("Alice", "16180339"));
        myContacts.add(new Contact("Tom", "11235813"));
    }


    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public static boolean addNewContact(Contact contact){
        if(myContacts.indexOf(contact) == -1){
            myContacts.add(contact);
            return true;
        }else{
            return false;
        }
    }


    public static boolean updateContact(Contact existContact , Contact newContact){
       if(myContacts.indexOf(existContact) != -1){
           myContacts.set(myContacts.indexOf(existContact) , newContact);
           return true;
       }
       return false;
    }



    public static boolean removeContact(Contact contact){
        if(myContacts.indexOf(contact) != -1){
            myContacts.remove(contact);
            return true;
        }

        return false;

    }


    public static int findContact(Contact contact){

       return myContacts.indexOf(contact);


    }


    public static int findContact(String contact){

       for(Contact cnt : myContacts){
           if(cnt.getName().equals(contact)){
               return myContacts.indexOf(cnt);
           }
       }

       return -1;
    }


    public Contact queryContact(String name){
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }


    public void printContact(){
        System.out.println("Contact List:");
        for(Contact cnt : myContacts){
            System.out.println(myContacts.indexOf(cnt) +
                    "." + " " + cnt.getName() + " " + "->" +
                    cnt.getPhoneNumber());

        }
    }

}
