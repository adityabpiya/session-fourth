package day12.inheritance;

public class Employee {

    private String name;
    private double salary;
    public Employee(){}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    protected String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
