package org.example.w3dataStructures.introduction;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<>();

        teams.add("São Paulo");
        teams.add("Santos");
        teams.add("Liverpool");
        teams.add("Barcelona");

        Iterator<String> it = teams.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
