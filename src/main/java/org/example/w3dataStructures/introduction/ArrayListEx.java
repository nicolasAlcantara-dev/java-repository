package org.example.w3dataStructures.introduction;

// Import the ArrayList class
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Golf");
        cars.add("Jetta");
        cars.add("Santana");
        cars.add("Astra");

        System.out.println(cars.get(1));
    }
}
