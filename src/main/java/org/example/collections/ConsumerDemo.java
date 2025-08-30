package org.example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Integer> tConsumer = (integer) -> System.out.println("Printing integer:" + integer);
        tConsumer.accept(10);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().forEach(integer -> System.out.println("Printing integer:" + integer));
    }
}
