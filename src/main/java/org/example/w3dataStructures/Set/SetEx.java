package org.example.w3dataStructures.Set;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        // Collection of elements where every element is unique.


        // TreeSet, stores unique elements in sorted order.
        // LinkedHashSet, stores unique elements and remembers the order they were added.
        cars.add("Golf");
        cars.add("Jetta");
        cars.add("Astra");
    }
}
