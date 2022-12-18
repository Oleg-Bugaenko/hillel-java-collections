package phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneBook {
    private String namePhoneBook;
    private List<Notes> personPhones = new ArrayList<>();


    public PhoneBook() {}

    public PhoneBook(String namePhoneBook) {
        this.namePhoneBook = namePhoneBook;
    }


   public void add(String name, String... phoneNumber) {
        personPhones.add(new Notes(name, Arrays.stream(phoneNumber).toList()));
   }


   public Notes find(String name) {
       for (Notes person: personPhones) {
           if (name.equals(person.getName())) return person;
       }
       return null;
   }

   public List<Notes> findAll(String name) {
       List<Notes> allPerson = new ArrayList<>();
       for (Notes person: personPhones) {
           if (name.equals(person.getName())) allPerson.add(person);
       }
       return allPerson;
   }






}
