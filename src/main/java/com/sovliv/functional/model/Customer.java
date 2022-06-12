package com.sovliv.functional.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@RequiredArgsConstructor
public class Customer {
    private final String name;
    private final String phone;
}
