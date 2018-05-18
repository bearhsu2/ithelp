package idv.kuma.featureenvyexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bearhsu2 on 1/2/2018.
 */
public class PhoneBook {
    List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public String generateFormattedPrint(){
        String result = "";
        for (Contact contact : contacts){

            result += contact.generateFormattedPrint();
            result += "\n";
        }
        return result;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
