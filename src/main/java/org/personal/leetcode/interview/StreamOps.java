package org.personal.leetcode.interview;

import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOps {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Hi", "Bye", "Hello", "World", "Java"));
        ArrayList<String> myOtherList = new ArrayList<>(Arrays.asList("Random", "Test", "Array", "List", "Java8"));

        List<String> combinedSorted = Stream.concat(myList.stream(), myOtherList.stream()).sorted().toList();


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, "Developer"));
        employees.add(new Employee("Alice", 25, "Tester"));
        employees.add(new Employee("Bob", 32, "Manager"));


        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Integer.compare(e1.age, e2.age))
                .toList();


        List<Employee> distinctEmployees = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getName,  // key mapper (property to distinct by)
                        Function.identity(),  // value mapper (the employee object itself)
                        (existing, replacement) -> existing  // merge function (keep the first occurrence)
                ))
                .values()
                .stream()
                .toList();

        Map<String, List<Employee>> employeesByRole = employees.stream()
                .collect(Collectors.groupingBy(Employee::getRole));


        List<String> groupedNames = employees.stream()
                // Function.identity() is a method reference that returns the identity function.
                // The identity function simply returns its input argument unchanged.
                // Here, it is used in the groupingBy() method to specify that we want to group
                // the employees by their name, which is the same as the input argument to the
                // identity function.
                // The Collectors.mapping() method is used to map each employee to its name,
                // and the Collectors.toList() collector is used to collect the names into a list.
                .collect(Collectors.groupingBy(
                                Function.identity(),  // returns the input argument unchanged
                                Collectors.mapping(
                                        Employee::getName,  // maps each employee to its name
                                        Collectors.toList())  // collects the names into a list
                        )
                )
                .entrySet().stream()
                .map(e -> String.format("%s (%s)", e.getValue().size() > 1 ? "Team" : "Person", String.join(", ", e.getValue())))
                .toList();

        long managerCount = employees.stream()
                .map(Employee::getRole) // map each employee to its role
                .filter("Manager"::equals) // filter out non-managers
                .count(); // count the remaining managers

        long managerCount1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getRole, Collectors.counting()))
                .getOrDefault("Manager", 0L);

        ArrayList<Integer> myIntList = new ArrayList<>(Arrays.asList(6, 1, 9, 2, 5, 3, 8, 7, 4));


        //combine two arrays and sort them
        List<Integer> combinedSortedInts = Stream.concat(myIntList.stream(), myIntList.stream()).sorted().toList();

        //combine two arrays and sort them
        int[] x = {1, 3, 5};
        int[] y = {2, 4, 6};
        int[] combinedArray = Stream.of(x, y)
                .flatMapToInt(Arrays::stream).toArray();
        int[] sortedCombinedArray = Arrays.stream(combinedArray).sorted().toArray();


        List<Integer> duplicates = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> duplicateRemoved = duplicates.stream().distinct().toList();

        String str = "hello";
        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //first non repeating char
         str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

        Map<String, List<Employee>> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getRole, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                                .sorted(Comparator.comparing(Employee::getAge).reversed()).toList())));

    }

    @Data
    static class Employee {
        private String name;
        private int age;
        private String role;

        public Employee(String name, int age, String role) {
            this.name = name;
            this.age = age;
            this.role = role;
        }
    }
}
