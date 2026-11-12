package chapter13_stream;

import java.util.*;

public class L4FilterWithObjectList {

    public static void main(String[] args) {

        Person person2 = new Person("Aung Aung", 24);
        Person person4 = new Person("Zaw Zaw", 26);
        Person person3 = new Person("Kyaw Kyaw", 25);
        Person person1 = new Person("Than Zaw", 23);
        Person person6 = new Person("Naw Naw", 28);
        Person person7 = new Person("Paw Paw", 29);
        Person person5 = new Person("Maw Maw", 27);
        Person person8 = new Person("Thaw Thaw", 30);

        List<Person> personList = Arrays.asList(
                person1, person2, person3, person4,
                person5, person6, person7, person8
        );

        var result = personList.stream()
                .filter(person -> person.age() > 26)
                .map(person -> person.name())
                .toList();

        System.out.println(result);
    }
}
