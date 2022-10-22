package lesson4;

import java.util.*;

/**
 * @author Makarenko Viktoria
 * @version 22/10/2022
 */

public class Task {
    public static void main(String[] args) {
        String[] words = {"lake", "wood", "man", "lock", "cat", "lock", "cheek", "cat", "football", "lock"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Khitrov", "555");
        pb.add("Ivanov", "345");
        pb.add("Ivanov", "891");

        System.out.println(pb.get("Ivanov"));
    }
}