package day5;

import java.time.LocalDate;

public class Employee  {

    private String name;
    private int age;
    private double salary;
    private LocalDate hireDate;

    public Employee(){}  //Default constructor

    //paramaterized constructor
    public Employee(String name, int age, double salary, LocalDate hireDate){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
