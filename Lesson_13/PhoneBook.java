package Lesson_13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String[]> phoneNumbers;

    public PhoneBook() {
        phoneNumbers = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (phoneNumbers.containsKey(name)) {

            String[] existingNumbers = phoneNumbers.get(name);
            String[] newNumbers = Arrays.copyOf(existingNumbers, existingNumbers.length + 1);

            newNumbers[existingNumbers.length] = phoneNumber;
            phoneNumbers.put(name, newNumbers);
        } else {

            phoneNumbers.put(name, new String[]{phoneNumber});
        }
    }

    public String[] get(String name) {
        return phoneNumbers.getOrDefault(name, new String[0]);
    }
}