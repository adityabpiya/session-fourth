package day5;

import java.time.LocalDate;

public class EmployeeTest {

    /**
     * This function is the main function
     * @param args
     */
    public static void main(String[] args) {

        /**
         * These constructors are used to enter info of the employees
         */

        Employee employee1 = new Employee("Aditya", "Bhasu", "Piya","987654321", 25, 105000, null);
        Employee employee2 = new Employee("Sireej", "Pradhan", "987876765", 26, 95000, LocalDate.now());

        /**
         * This method is used for giving an employee a rasise
         * Input is in percentage
         */
        employee1.raiseSalary(10);

        employee1.displayEmployeeDetail();
        employee2.displayEmployeeDetail();

        System.out.println(Employee.getCount());

    }
}
