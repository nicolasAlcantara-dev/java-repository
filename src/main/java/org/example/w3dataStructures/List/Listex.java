package org.example.w3dataStructures.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listex {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        // LinkedList better to manipulate elements

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("VW");
        cars.add("GM");
        System.out.println(cars);

        cars.add(3, "Chevrolet");
        System.out.println(cars);

        List<Integer> ages = new ArrayList<>();
        // ArrayList just to get elements

        ages.add(19);
        ages.add(20);
        ages.add(22);
        ages.add(16);
        ages.add(34);
    }
}
