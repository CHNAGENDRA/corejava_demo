package org.example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
//      Supplier<String> supplier = () -> "Hi Java Developer";

//        Supplier<String> demo = new SupplierDemo();
//        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        String s = list.stream().findAny().orElseGet(() -> "Hi Java Developer");
        System.out.println(s);


    }
}
