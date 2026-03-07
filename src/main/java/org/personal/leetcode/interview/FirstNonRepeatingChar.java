package org.personal.leetcode.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String s = "loveleetcode";


        String firstNonRepeatingChar = Arrays.stream(s.split(""))
                .filter(i -> s.indexOf(i) == s.lastIndexOf(i))
                .findFirst()
                .orElse("");

        int index = s.indexOf(firstNonRepeatingChar);


        int ans = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .findFirst()
                .map(entry -> s.indexOf(entry.getKey()))
                .orElse(-1);
        System.out.println(ans);

        String ans1 = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey).get();

        System.out.println(ans1);

    }
}
