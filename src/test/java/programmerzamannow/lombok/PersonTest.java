package programmerzamannow.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void testViaConstructor() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Gaming");
        hobbies.add("Review");
        hobbies.add("Fishing");

        var person = new Person("id", "name", 20, hobbies);

    }

    @Test
    void testViaSetter() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Gaming");
        hobbies.add("Review");
        hobbies.add("Fishing");

        var person = new Person();
        person.setId("id");
        person.setName("name");
        person.setAge(20);
        person.setHobbies(hobbies);
    }

    @Test
    void testViaBuilder() {

        var person = Person.builder()
                .id("id")
                .name("name")
                .age(30)
                .hobby("Gaming")
                .hobby("Traveling")
                .hobby("Fishing")
                .build();

        System.out.println(person);
    }
}
