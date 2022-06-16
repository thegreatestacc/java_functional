package com.sovliv.functional.streams;

import com.sovliv.functional.enums.Gender;
import com.sovliv.functional.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                Person.builder().name("Vladimir").gender(Gender.MALE).build(),
                Person.builder().name("Alexandra").gender(Gender.FEMALE).build(),
                Person.builder().name("Dmitry").gender(Gender.MALE).build(),
                Person.builder().name("Olga").gender(Gender.FEMALE).build(),
                Person.builder().name("BUGAGA").gender(Gender.SOME_SHIT).build()
        );


        //added some comments
        persons.stream()
                .map(Person::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
