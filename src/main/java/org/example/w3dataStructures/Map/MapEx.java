package org.example.w3dataStructures.Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        // A HashMap stores items in key/value pairs, where each key maps to a specific value.
        // TreeMap, which stores key/value pairs in sorted order by key.
        // A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
        
        people.put(1, "Nicolas");
        people.put(2, "Nicolas");
        people.put(4, "Vitoria");
        people.put(15, "Miguel");
        people.put(19, "Bernardo");

            for (Integer i : people.keySet()) {
            System.out.println(i + " " + people.get(i));
        }
    }
}
