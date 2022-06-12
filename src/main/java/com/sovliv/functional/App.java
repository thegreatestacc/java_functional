package com.sovliv.functional;

import com.sovliv.functional.enums.Gender;
import com.sovliv.functional.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                Person.builder().name("Vladimir").gender(Gender.MALE).build(),
                Person.builder().name("Alexandra").gender(Gender.FEMALE).build(),
                Person.builder().name("Dmitry").gender(Gender.MALE).build(),
                Person.builder().name("Olga").gender(Gender.FEMALE).build()
        );

        List<Person> female = persons.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

}
