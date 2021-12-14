package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Aditya Piya");
        employee.setAge(25);
        employee.setSalary(105000);
        employee.setHireDate(LocalDate.now());


        Employee employee1 = new Employee("Aditya Piya", 25, 105000, LocalDate.now());



    }
}
