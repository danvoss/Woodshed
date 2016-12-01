package com.dvoss;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Dan on 9/26/16.
 */
public class Streams {

    public static void main(String[] args) {

        // www.tutorialspoint.com/java8

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream()
                .map(n -> n*n)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(squaresList);

        List<String> strs = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strs.stream()
                .filter(s -> s.isEmpty())
                .count();
        System.out.println(count);

        Random r = new Random();
        r.ints()
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        String myString = "1000";
        int myInt = Integer.valueOf(myString);
        System.out.println(myInt);

        // some others

        Stream<Double> randoms = Stream.generate(Math::random).limit(5);
        randoms.forEach(System.out::println);
    }
}
