package idv.kuma.featureenvyexample;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
/**
 * Created by bearhsu2 on 1/2/2018.
 */
public class PhoneBookTest {

    private final int LINE_LENGTH = 10;

    @Test
    public void testGenerateFormattedPrint() throws Exception {

        // Prepare data
        Contact mockedContact = Mockito.mock(Contact.class);
        String fakeLine = RandomStringUtils.randomAlphanumeric(LINE_LENGTH);
        Mockito.doReturn(fakeLine).when(mockedContact).generateFormattedPrint();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(mockedContact);
        phoneBook.addContact(mockedContact);

        // Execute method
        String result = phoneBook.generateFormattedPrint();

        // Check result
        String expected = fakeLine + "\n" + fakeLine + "\n";
        assertEquals(expected, result);

        System.out.println(result);
    }
}