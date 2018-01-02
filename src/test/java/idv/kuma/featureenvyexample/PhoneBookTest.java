package idv.kuma.featureenvyexample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bearhsu2 on 1/2/2018.
 */
public class PhoneBookTest {
    @Test
    public void testGenerateFormattedPrint() throws Exception {

        // Prepare data
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Kuma", "kuma@aaa.bbb", "123456789"));
        phoneBook.addContact(new Contact("Maku", "maku@ccc.ddd", "987654321"));

        // Execute method
        String result = phoneBook.generateFormattedPrint();

        // Check result
        String expected = "Kuma: kuma@aaa.bbb | 123456789. \nMaku: maku@ccc.ddd | 987654321. \n";

        assertEquals(expected, result);
        System.out.println(result);

    }
}