package org.example.w3dataStructures.introduction;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Nicolas", 20);
        people.put("Vitoria", 19);

        System.out.println(people);
    }
}
