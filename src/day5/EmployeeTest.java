package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {



        Employee employee1 = new Employee("Aditya", "Bhasu", "Piya","987654321", 25, 105000, null);
        Employee employee2 = new Employee("Sireej", "Pradhan", "987876765", 26, 95000, LocalDate.now());


        employee1.raiseSalary(10);

        employee1.displayEmployeeDetail();
        employee2.displayEmployeeDetail();

    }
}
