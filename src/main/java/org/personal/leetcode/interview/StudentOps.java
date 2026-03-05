package org.personal.leetcode.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOps {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Student {
        int studentId;
        String name;
        String subject;
        int marks;
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Alice", "Maths", 85),
                new Student(1, "Bob", "Maths", 90),
                new Student(1, "Charlie", "Maths", 75),
                new Student(2, "Alice", "Science", 80),
                new Student(2, "Bob", "Science", 85),
                new Student(2, "Charlie", "Science", 90),
                new Student(3, "Alice", "English", 85),
                new Student(3, "Bob", "English", 90),
                new Student(3, "Charlie", "English", 85)
        );

        Map<Integer, Integer> studentMarks = students.stream()
                .collect(Collectors.groupingBy(Student::getStudentId, Collectors.summingInt(Student::getMarks)));

        System.out.println(studentMarks);

        Integer i = studentMarks.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(i);
    }
}
