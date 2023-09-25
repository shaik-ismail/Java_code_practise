package com.java.practise.streams;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

  static List<Employee> employeeList = new ArrayList<Employee>();

  static {
    employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 211, 25000.0, LocalDate.of(2000, 1, 1),
        List.of(
            Timestamp.valueOf("2000-1-1 00:00:00.00"),
            Timestamp.valueOf("2000-1-2 00:00:00.00"),
            Timestamp.valueOf("2000-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 215, 13500.0, LocalDate.of(201, 1, 1),
            List.of(
                Timestamp.valueOf("2001-1-1 00:00:00.00"),
                Timestamp.valueOf("2001-1-2 00:00:00.00"),
                Timestamp.valueOf("2001-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 212, 18000.0, LocalDate.of(2002, 1, 1),
            List.of(
                Timestamp.valueOf("2002-1-1 00:00:00.00"),
                Timestamp.valueOf("2002-1-2 00:00:00.00"),
                Timestamp.valueOf("2002-1-3 00:00:00.00"))));
    employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 214, 32500.0,
        LocalDate.of(2003, 1, 1),
        List.of(
            Timestamp.valueOf("2003-1-1 00:00:00.00"),
            Timestamp.valueOf("2003-1-2 00:00:00.00"),
            Timestamp.valueOf("2003-1-3 00:00:00.00"))));
    employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 213, 22700.0, LocalDate.of(2004, 1, 1),
        List.of(
            Timestamp.valueOf("2004-1-1 00:00:00.00"),
            Timestamp.valueOf("2004-1-2 00:00:00.00"),
            Timestamp.valueOf("2004-1-3 00:00:00.00"))));
    employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 216, 10500.0,
        LocalDate.of(2005, 1, 1),
        List.of(
            Timestamp.valueOf("2005-1-1 00:00:00.00"),
            Timestamp.valueOf("2005-1-2 00:00:00.00"),
            Timestamp.valueOf("2005-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 210, 27000.0, LocalDate.of(2006, 1, 1),
            List.of(
                Timestamp.valueOf("2006-1-1 00:00:00.00"),
                Timestamp.valueOf("2006-1-2 00:00:00.00"),
                Timestamp.valueOf("2006-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(188, "Wang Liu", 31, "Male", "Product Development", 215, 34500.0, LocalDate.of(2007, 1, 1),
            List.of(
                Timestamp.valueOf("2007-1-1 00:00:00.00"),
                Timestamp.valueOf("2007-1-2 00:00:00.00"),
                Timestamp.valueOf("2007-1-3 00:00:00.00"))));
    employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 216, 11500.0,
        LocalDate.of(2008, 1, 1),
        List.of(
            Timestamp.valueOf("2008-1-1 00:00:00.00"),
            Timestamp.valueOf("2008-1-2 00:00:00.00"),
            Timestamp.valueOf("2008-1-3 00:00:00.00"))));
    employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 215, 11000.5,
        LocalDate.of(2009, 1, 1),
        List.of(
            Timestamp.valueOf("2009-1-1 00:00:00.00"),
            Timestamp.valueOf("2009-1-2 00:00:00.00"),
            Timestamp.valueOf("2009-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 214, 15700.0, LocalDate.of(2010, 1, 1),
            List.of(
                Timestamp.valueOf("2010-1-1 00:00:00.00"),
                Timestamp.valueOf("2010-1-2 00:00:00.00"),
                Timestamp.valueOf("2010-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 216, 28200.0, LocalDate.of(2011, 1, 1),
            List.of(
                Timestamp.valueOf("2011-1-1 00:00:00.00"),
                Timestamp.valueOf("2011-1-2 00:00:00.00"),
                Timestamp.valueOf("2011-1-3 00:00:00.00"))));
    employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 213, 21300.0,
        LocalDate.of(2012, 1, 1), List.of(
        Timestamp.valueOf("2012-1-1 00:00:00.00"),
        Timestamp.valueOf("2012-1-2 00:00:00.00"),
        Timestamp.valueOf("2012-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 217, 10700.5, LocalDate.of(2013, 1, 1),
            List.of(
                Timestamp.valueOf("2013-1-1 00:00:00.00"),
                Timestamp.valueOf("2013-1-2 00:00:00.00"),
                Timestamp.valueOf("2013-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 218, 12700.0, LocalDate.of(2014, 1, 1),
            List.of(
                Timestamp.valueOf("2014-1-1 00:00:00.00"),
                Timestamp.valueOf("2014-1-2 00:00:00.00"),
                Timestamp.valueOf("2014-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 215, 28900.0, LocalDate.of(2015, 1, 1),
            List.of(
                Timestamp.valueOf("2015-1-1 00:00:00.00"),
                Timestamp.valueOf("2015-1-2 00:00:00.00"),
                Timestamp.valueOf("2015-1-3 00:00:00.00"))));
    employeeList.add(
        new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 212, 35700.0, LocalDate.of(2016, 1, 1),
            List.of(
                Timestamp.valueOf("2016-1-1 00:00:00.00"),
                Timestamp.valueOf("2016-1-2 00:00:00.00"),
                Timestamp.valueOf("2016-1-3 00:00:00.00"))
        ));
  }

  int id;
  String name;
  int age;
  String gender;
  String department;
  int yearOfJoining;
  double salary;

  List<Timestamp> visitors;

  LocalDate dateOfJoining;

  public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary,
      LocalDate dateOfJoining, List<Timestamp> visitors) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.department = department;
    this.yearOfJoining = yearOfJoining;
    this.salary = salary;
    this.dateOfJoining = dateOfJoining;
    this.visitors = visitors;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getDepartment() {
    return department;
  }

  public int getYearOfJoining() {
    return yearOfJoining;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getDateOfJoining() {
    return dateOfJoining;
  }

  public void setDateOfJoining(LocalDate dateOfJoining) {
    this.dateOfJoining = dateOfJoining;
  }

  public List<Timestamp> getVisitors() {
    return visitors;
  }

  public void setVisitors(List<Timestamp> visitors) {
    this.visitors = visitors;
  }

  @Override
  public String toString() {
    return "com.java.practise.streams.Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", department='" + department + '\'' +
        ", yearOfJoining=" + yearOfJoining +
        ", salary=" + salary +
        ", dateOfJoining=" + dateOfJoining +
        ", visitors=" + visitors +
        '}';
  }
}
