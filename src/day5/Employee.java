package day5;

import java.time.LocalDate;
import java.util.Objects;

/**
 * This class is used for representing the employees
 */
public class Employee  {

    private String firstName; //Mandatory
    private String middleName; //opt
    private String lastName; //Mandatory
    private String socialSecurityNumber;
    private int age; //Mandatory
    private double salary; //Mandatory
    private LocalDate hireDate; //Mandatory
    private static int count = 0;


    private Employee(){}  //Default constructor

    //parameterized constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, int age, double salary, LocalDate hireDate){
        count += 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());
    }


    public Employee(String firstName,String middleName, String lastName, String socialSecurityNumber, int age, double salary, LocalDate hireDate){
        this(firstName, lastName, socialSecurityNumber, age, salary, hireDate); //Calling constructor should be in first line of constructor
        this.middleName = middleName;


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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void raiseSalary(double percentage){
        this.salary += (this.salary * percentage)/100;
    }

    public static int getCount() {
        return count;
    }

    public void displayEmployeeDetail (){
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate.toString());
    }

}
