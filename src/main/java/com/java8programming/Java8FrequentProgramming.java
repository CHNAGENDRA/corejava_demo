package com.java8programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8FrequentProgramming {
    public static void main(String[] args) {
        //java program to count the occurrence  of each character  in a string
        String str = "ilovejavatech";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //java program to find the duplicate elements in a string
        List<String> collect1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //java program to find the unique elements in a string
        List<String> collect2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect2);

        //java program to find the first non-repeated character in a string
        String string = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("first non repeated element "+string);

        //java program to find the second highest number from given array
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        Integer secondHighestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighestNumber);

        //java program to find the largest string from given array
        String[] strArray = {"java", "python", "javascript", "spring", "hibernate", "dockerk8s amazonwebservices"};
        String longestString = Arrays.stream(strArray).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(longestString);

        //java program to  find all elements  from array who starts with 1
        int[] arr = {5, 9, 11, 2, 8, 21, 1, 29};
        List<String> collectedElemStartsWith1 = Arrays.stream(arr).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(collectedElemStartsWith1);

        //String.join example to show 1-3-5-7
        List<String> list = Arrays.asList("1","3","5","7");
        String result = String.join("-", list);
        System.out.println(result);

        //skip and limit method use case based example
        IntStream.range(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);

        //sort a list and map using java8

        //map() and flatmap() example
        List<Customer> customers = EkartDatabase.getAll();
        //one to one mapping
        List<String> emailList = customers.stream()
                .map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emailList);
        //one to many mapping stream of stream
        List<List<String>> phoneNumbers = customers.stream()
                .map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
        //flattening stream of stream
        List<String> flattenedList = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}
