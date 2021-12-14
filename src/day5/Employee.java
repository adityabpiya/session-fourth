package day5;

import java.time.LocalDate;

public class Employee  {

    private String firstName; //Mandatory
    private String middleName; //opt
    private String lastName; //Mandatory
    private int age; //Mandatory
    private double salary; //Mandatory
    private LocalDate hireDate; //Mandatory


    private Employee(){}  //Default constructor

    //parameterized constructor
    public Employee(String firstName, String lastName, int age, double salary, LocalDate hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;

    }


    public Employee(String firstName,String middleName, String lastName, int age, double salary, LocalDate hireDate){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;

    }



    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



    public double getSalary() {
        return salary;
    }



    public LocalDate getHireDate() {
        return hireDate;
    }


    public void raiseSalary(Employee employee, double percentage){
        employee.salary += (employee.salary * percentage)/100;
    }


    public void displayEmployeeDetail (Employee employee){
        System.out.println(employee.firstName);
        System.out.println(employee.middleName);
        System.out.println(employee.lastName);
        System.out.println(employee.age);
        System.out.println(employee.salary);
        System.out.println(employee.hireDate);
    }

}
