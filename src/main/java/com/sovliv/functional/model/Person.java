package com.sovliv.functional.model;

import com.sovliv.functional.enums.Gender;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@RequiredArgsConstructor
public class Person {
    private final String name;
    private final Gender gender;
}
