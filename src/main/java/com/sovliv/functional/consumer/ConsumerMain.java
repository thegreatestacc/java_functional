package com.sovliv.functional.consumer;

import com.sovliv.functional.model.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Customer customer = Customer.builder().name("Vladimir").phone("8-800-555-35-35").build();
//        greetCustomer.accept(vladimir);

        biGreetCustomer.accept(customer, false);
    }

    static Consumer<Customer> greetCustomer = customer -> System.out.printf("Greetings %s, your phone number is %s%n",
            customer.getName(), customer.getPhone()
    );

    static BiConsumer<Customer, Boolean> biGreetCustomer = (customer, showPhoneNumber) -> System.out.printf("Greetings %s, your phone number is %s%n",
            customer.getName(), (showPhoneNumber ? customer.getPhone() : "*****")
    );

}
