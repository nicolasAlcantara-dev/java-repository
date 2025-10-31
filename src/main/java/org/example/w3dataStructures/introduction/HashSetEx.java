package org.example.w3dataStructures.introduction;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Nicolas"); // Duplicate
        names.add("Vitoria");
        names.add("Nicolas");
        names.add("Miguel");

        System.out.println(names);
    }
}
