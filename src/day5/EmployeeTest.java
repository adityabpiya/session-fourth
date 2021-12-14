package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {



        Employee employee1 = new Employee("Aditya","Bhasu", "Piya", 25, 105000, LocalDate.now());
        Employee employee2 = new Employee("Sireej", "Pradhan", 26, 95000, LocalDate.now());


        employee1.raiseSalary(employee1,10);

        employee1.displayEmployeeDetail(employee1);
        employee2.displayEmployeeDetail(employee2);

    }
}
