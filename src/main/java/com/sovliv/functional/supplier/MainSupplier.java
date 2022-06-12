package com.sovliv.functional.supplier;

import java.util.List;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {

        var url = getDBConnectionUrlSupplier.get();
        System.out.println(url);

    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
            List.of("jdbc://localhost:5432/db_name",
                    "jdbc://localhost:5432/test_db");

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/db_name";
    }
}
