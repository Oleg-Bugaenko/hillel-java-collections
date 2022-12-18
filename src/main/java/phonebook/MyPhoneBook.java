package phonebook;

import java.util.List;

public class MyPhoneBook {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook("My Phone Book");

        myPhoneBook.add("Alex", "+38(099)046-45-67", "+38(095)045-45-68");
        myPhoneBook.add("Nick", "+38(076)345-15-78");
        myPhoneBook.add("Emily", "+38(099)234-56-87", "+38(096)018-45-67");
        myPhoneBook.add("Alex", "+38(076)143-45-88");
        myPhoneBook.add("Jane", "+38(095)087-42-56");
        myPhoneBook.add("Jack", "+38(099)049-88-96", "+38(096)546-23-19");


        System.out.println(myPhoneBook.find("Jack"));

        System.out.println(myPhoneBook.find("George"));

        List<Notes> list = myPhoneBook.findAll("Alex");
        for (Notes person: list) {
            System.out.println(person);
        }



    }
}
