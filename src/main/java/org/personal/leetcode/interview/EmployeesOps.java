package org.personal.leetcode.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeesOps {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class Employee {

        private Integer empId;
        private String role;
        private Double salary;
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "manager", 5000.0),
                new Employee(2, "engineer", 4500.0),
                new Employee(3, "technician", 5500.0),
                new Employee(4, "engineer", 6000.0),
                new Employee(5, "technician", 4800.0),
                new Employee(6, "manager", 5200.0),
                new Employee(7, "technician", 5100.0),
                new Employee(8, "engineer", 6200.0),
                new Employee(9, "manager", 5700.0)
        );

        Employee maxSalEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().get();

        //group employee by role and find max salary
        Map<String, Integer> collect = employees.stream()
                .collect(Collectors.groupingBy(
                                Employee::getRole,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .max(Comparator.comparing(Employee::getSalary))
                                                .map(Employee::getEmpId)
                                                .orElse(null))
                        )
                );

        System.out.println(collect);
    }


}

