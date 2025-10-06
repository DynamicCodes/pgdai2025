package com.internship.basicProgramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamDemo {
    public static void main(String[] args) {

        // 1. from Arrays
        String[] array = {"java","python","c++", "Ruby"};
        Stream<String> streamFromArray = Arrays.stream(array);

        System.out.println("arrays to stream");
        streamFromArray.forEach(System.out::println);

        // 2. from collections
        List<Integer> numbers = Arrays.asList(1,2,3);
        Stream<Integer> numbersStream = numbers.stream();
        System.out.println("LIst to stream");
        numbersStream.forEach(System.out::println);

        //3. using Stream.of()
        Stream<String> streamOf = Stream.of("apple","banana");
        System.out.println("streamOf to stream");
        streamOf.forEach(System.out::println);

        //4. using Stream.generate()
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(3);

        //5. using Stream.iterate()
        Stream<Integer> evenNumber = Stream.iterate(2,n->n+2).limit(10);

        //6. from String Character
        IntStream charStream = "Hello".chars();

        //7. range of numbers
        IntStream range = IntStream.range(1, 10);//1=>9

        // intermediate = processing elements but not having any ending condition. example => 2%2

        List<String> names = Arrays.asList("Apple", "Banana", "Ruby","Carrot","Tomato","Brinjal");

        //1. filter() , when you want to filter based on a condition
        System.out.println("Names starting with A and C");
        names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("C")) //(n->n%2)
                .forEach(System.out::println);

        // 2. map() => transform a value, var = 2 => 2+2 = 4;
        System.out.println("Map method for transforming into lowerCase");
        names.stream()
                .map(String::toLowerCase)   // (n->n+2)
                .forEach(System.out::println);

        //3. sorted()- sort the elements
        System.out.println("using sorted method to sort the elemenst");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        //4. distinct() - remove duplicates
        System.out.println("using distinct to remove duplicates");
        List<Integer> numbersWithDuplicates = Arrays.asList(1,2,3,5,6,1,2,5);
        numbersWithDuplicates.stream()
                .distinct()
                .forEach(System.out::println);

        //5. limit()- limimting numbe rof elements
        System.out.println("using limit method");
        numbersWithDuplicates.stream()
                .limit(7)
                .forEach(System.out::println);

        // 6. skip() - skip the first n elements
        System.out.println("using skip to skip first n elements");
        names.stream()
                .skip(3)
                .forEach(System.out::println);

        // terminal = is the ending point of a stream, where you show output. example => result of 2%2
        List<Integer> numbersForTerminal = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //1. forEach()
        System.out.println("using forEach to perform action on each element");
        numbersForTerminal.stream().forEach(System.out::println);

        // 2. collect() => collec the elements into a collection
        System.out.println("using collect to collect the elements");
        List<Integer> evenNumberTerminal = numbersForTerminal.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumberTerminal: " + evenNumberTerminal);

        //3. count() - count the elements
        System.out.println("counting the values greater than 5");
        long count = numbersForTerminal.stream()
                .filter(n -> n>5)
                .count();
        System.out.println("count: " + count);

        //4. reduce() - reduce to a single value, optional is used when you know that the operation you're going to perform can have null result also
        System.out.println("using reduce to a single value");
        Optional<Integer> sum = numbersForTerminal.stream().reduce((a,b) -> a+b);

        sum.ifPresent(System.out::println);

        //5. anyMatch(), allMatch(), noneMatch()
        System.out.println("method to check for condition matching");
        boolean hasEven = numbersForTerminal.stream().anyMatch(n-> n%2 == 0);
        boolean allPositive = numbersForTerminal.stream().allMatch(n -> n>0);
        boolean noneNegative = numbersForTerminal.stream().noneMatch(n -> n<0);

        System.out.println("hasEven: " + hasEven);
        System.out.println("allPositive: " + allPositive);
        System.out.println("noneNegative: " + noneNegative);

        // 6. findFirst(), findAny()
        System.out.println("methods for findFirst and findAny");
        Optional<Integer> first = numbersForTerminal.stream().filter(n->n>5).findAny();
        first.ifPresent(System.out::println);

        // 7. min() max()
        System.out.println("method for min and max");
        Optional<Integer> min = numbersForTerminal.stream().min(Integer::compareTo);
        Optional<Integer> max = numbersForTerminal.stream().max(Integer::compareTo);

        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }
}
