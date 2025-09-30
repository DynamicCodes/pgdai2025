package com.internship.basicProgramming.collectionApi;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. List => ordered collection that allow duplicates and positional element access
//        List<String> languages = new ArrayList<>();
//
//        // adding elements
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("C");
//
//        // accessing the elements
//        System.out.println("Language at oth index : " + languages.get(0));
//        System.out.println("Language at other index : " + languages.get(1));
//        System.out.println("Get the size of my List : " + languages.size());
//        System.out.println(languages);
//
//        // iterating
//        for(String lan : languages) {
//            System.out.println(lan);
//        }
//
//        // remove elements
//        languages.remove("Python");
//        languages.remove(0);
//        // iterating
//        for(String lan : languages) {
//            System.out.println(lan);
//        }
//        // after removing the values index shifts
//        System.out.println("Language at other index : " + languages.get(0));
//
//        // LinkedLIst implementations
//        LinkedList<Integer> numbers = new LinkedList<>();
//
//        // add elements
//        numbers.add(1);
//        numbers.add(2);
//        numbers.addFirst(3);
//        numbers.addLast(4);
//        numbers.add(1, 15);
//
//        // stack implementation
//        numbers.push(30);
//        System.out.println(numbers);
//        Integer deleted = numbers.pop();
//        System.out.println(deleted);
//
//        // queue
//        numbers.offer(17);
//        Integer polled = numbers.poll();
//        System.out.println(polled);
//
//        // showing the List
//        System.out.println(numbers);

        // Set interface
//        Set<String> set1 = new HashSet<String>();
//
//        // adding elements
//        set1.add("Apple");
//        set1.add("Banana");
//        set1.add("Orange");
//        set1.add("Grape");
//        set1.add("Orange");  // => no duplicates allowed
//        set1.remove("Apple");
//        System.out.println(set1);
//        System.out.println(set1.size());
//
//
//
//        // checking if something is present or not
//        if(set1.contains("Apple")) {
//            System.out.println("Eat it");
//        }
//
//        HashSet<String> vegies = new HashSet<>();
//        vegies.add("tomato");
//        vegies.add("potato");
//
//        set1.addAll(vegies);
//        System.out.println(set1);
//
//        // TreeSet with Sorted values
//        TreeSet<String> names = new TreeSet<>();
//
//        names.add("David");
//        names.add("Rahul");
//        names.add("Bob");
//        names.add("Chaitanya");
//
//        System.out.println(names);
//
//        // treeset methods
//        System.out.println("Print the first name " + names.first());
//        System.out.println("Print the last name " + names.last());
//        System.out.println("names higher than chaitanya " + names.higher("Chaitanya"));
//        System.out.println("names lower than tomato " + names.lower("Chaitanya"));
//
//        // subset
//        System.out.println("names in the range of 'Bob to David; " + names.subSet("Bob","David"));


        // Queue interface
//        PriorityQueue<String> pq = new PriorityQueue<>();
//
//        // add elements
//        pq.add("Banana");
//        pq.add("Apple");
//        pq.add("Grapes");
//        pq.add("Pineapple");
//        pq.add("AA");
//
//        System.out.println(pq);
//        System.out.println("checking the Top Element " + pq.peek());
//        pq.poll();
//        System.out.println(pq);
//        System.out.println("checking the Top Element " + pq.peek());
//
//        System.out.println(pq.isEmpty());

        //ArrayDequeue implementations
//        ArrayDeque<String> deque = new ArrayDeque<>();
//        deque.addFirst("World");
//        deque.addLast("Hello");
//        deque.addFirst("C-DAC");
//        deque.addLast("Guwahati");
//        deque.addLast("Daniel");
//
//        System.out.println(deque);
//
//        // removing elements
//        System.out.println("removing from the first position " + deque.removeFirst());
//        System.out.println("removing from the last position " + deque.removeLast());
//        deque.remove();
//        System.out.println(deque);
//
//        // stack implementaion
//        deque.push("Assam");
//        deque.pop();
//        System.out.println(deque);

        // Map interface
        Map<Integer, String>  rollNumber = new HashMap<>();

        // adding elements
        rollNumber.put(1, "David");
        rollNumber.put(2, "Mary");
        rollNumber.put(3, "John");
        rollNumber.put(4, "Bob");

        System.out.println("Printing roll number  " + rollNumber);

        rollNumber.put(3, "David"); // updating the value => no duplicate keys
        System.out.println("Printing roll number  " + rollNumber);

        // getting values
//        System.out.println("Name of roll number 2 is " + rollNumber.get(2));

        // if something contains in the map
        if(rollNumber.containsKey(1)) {
            System.out.println("Name of roll number 1 is " + rollNumber.get(1));
        }

        // iteration
        System.out.println("iterating over entire Map");
        for(Map.Entry<Integer, String> entry : rollNumber.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // iterating over keys only
        System.out.println("iterating over keys only");
        for(Integer key : rollNumber.keySet()){
            System.out.println(key + " : " + rollNumber.get(key));
        }
        // iterated over values
        for(String val : rollNumber.values()){
            System.out.println(val);
        }


        // Treeset
        System.out.println("Treeset impementation of Map");
        TreeMap<String, String> capitals = new TreeMap<>();
        // add elements here
        capitals.put("Assam", "Guwahati");
        capitals.put("AndhraPradesh", "Hyderabad");
        capitals.put("Belgium", "Belgium");
        capitals.put("Cyprus", "Cyprus");
        capitals.put("Cities", "Cities");

        System.out.println(capitals);

        // treemap methods
        System.out.println(capitals.keySet());
        System.out.println("First Key " + capitals.firstKey());
        System.out.println("Last Key " + capitals.lastKey());

    }
}
