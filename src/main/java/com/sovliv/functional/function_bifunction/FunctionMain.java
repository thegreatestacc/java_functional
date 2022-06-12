package com.sovliv.functional.function_bifunction;

import com.sovliv.functional.enums.Gender;
import com.sovliv.functional.model.Person;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {

        var result = incrementByOneFunction.apply(3);
        System.out.println(result);

        var vladimir = createManWithName.apply("Vlad");
        System.out.println(vladimir.getName());

        var apply = incrementByOneAndMultiplyBySomeNumber.apply(3, 5);
        System.out.println(apply);

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<String, Person> createManWithName = name -> new Person(name, Gender.MALE);

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBySomeNumber =
            (incrementByOne, multiplyBySomeNumber) -> (++incrementByOne) * multiplyBySomeNumber;


}
