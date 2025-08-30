package com.example.dsa;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        //collect each first letter of each word and make a string
        String input = "Hello Java Streams";
//        String result = IntStream.range(0, input.length())
//                .filter(i -> i == 0 || input.charAt(i - 1) == ' ')
//                .mapToObj(i -> String.valueOf(input.charAt(i)))
//                .reduce("", (a, b) -> a + b);
//        System.out.println(result); // HJS
        String response = Arrays.stream(input.split("\\s+"))
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
        System.out.println(response);
    }
}
