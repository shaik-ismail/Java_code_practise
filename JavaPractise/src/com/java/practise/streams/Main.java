package com.java.practise.streams;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public class Main {

  public static void main(String[] args) {

    List<Employee> employeeList = Employee.employeeList;
    Optional<Timestamp> collect = employeeList.stream().flatMap(o->o.visitors.stream()).max(Timestamp::compareTo);

    System.out.println(collect.get());
    //collect.forEach((k, v) -> System.out.println("Key=" + k + "  Value=" + v));

  }
}