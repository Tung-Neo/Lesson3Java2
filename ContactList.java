package Lesson3Java2;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contactList;

    public ContactList(){
        this.contactList = new ArrayList<>();
    }

    public ContactList(List<Contact> contactList){
        this.contactList = contactList;
    }

    public int getSize(){
        return this.contactList.size();
    }

    public List<Contact> getContactList(){
        return contactList;
    }

    private void setContactList(List<Contact> contactList){
        this.contactList = contactList;
    }
//phương thức
    public void addContact(Contact contact){
        contactList.add(contact);
    }
    public void uppdateContact(Contact oldContact, Contact newContact){
        int index = this.contactList.indexOf(oldContact);
        this.contactList.set(index, newContact);
    }

    public void removeContact(Contact contact){
        this.contactList.remove(contact);
    }

    public Contact searchContact(String contactName){
        int position = contactList.indexOf(contactName);
        if (position > 0){
            return contactList.get(position);
        }
        return null;
    }


    public void displayContact(List<Contact> contactList){
        System.out.println("Contact list");
        for (int i = 0; i < contactList.size(); i++){
            System.out.println((i+1) + ". " + contactList.get(i).getName() + " -> " + contactList.get(i).getPhone());
        }
    }
}
