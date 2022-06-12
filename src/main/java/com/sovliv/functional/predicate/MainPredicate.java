package com.sovliv.functional.predicate;

import com.sovliv.functional.model.Customer;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Customer customer = Customer.builder().name("Vladimir").phone("8-800-555-35-35").build();

        System.out.println(isPhoneNumberValidPredicate.test(customer.getPhone()));

        System.out.println(
                isPhoneNumberValidPredicate.or(containNumber5).test(customer.getPhone())
        );

        System.out.println(
                isNameAndPhoneValidBiPredicate.test(customer.getName(), customer.getPhone())
        );
    }

    static BiPredicate<String, String> isNameAndPhoneValidBiPredicate = (name, phoneNumber) ->
            name.startsWith("V") && phoneNumber.length() == 15;

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("8") && phoneNumber.length() == 15;

    static Predicate<String> containNumber5 = phoneNumber ->
            phoneNumber.contains("5");


    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("8") && phoneNumber.length() == 15;
    }
}
