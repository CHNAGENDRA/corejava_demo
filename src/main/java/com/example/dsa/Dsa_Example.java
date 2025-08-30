package com.example.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Dsa_Example {

    public static void main(String[] args) {
        //Array
        //✅ Stores elements in fixed size
        //📦 Like a row of lockers
        int[] numbers = {1,2,3,4,5};

        //ArrayList (like a dynamic array)
        //✅ Resizable array
        //🧾 Like a growing shopping list
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Boo");

        //LinkedList
        //✅ Allows fast insert/delete
        //🔗 Like a train with detachable coaches
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Orange");

        

        //Array
        System.out.println("Array testing : "+numbers[3]);

        //ArrayList
        names.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //LinkedList
        fruits.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
