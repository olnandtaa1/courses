package com.tms.olnandtaa1.lesson15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = IntStream.range(0, 20)
                .mapToObj(i -> random.nextInt(100))
                .collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println(numbers.stream()
                .distinct()
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .filter(number -> number > 7 && number <= 17)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .limit(4)
                .collect(Collectors.toList()));
        System.out.println(numbers.stream().count());
        System.out.println(numbers.stream()
                .mapToDouble(number -> number)
                .average());
    }
}
