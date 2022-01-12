package day12.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Sireej", 7000);

        System.out.println(employee1.toString());
        System.out.println(employee1.getSalary());

        Manager manager1 = new Manager("Aditya", 9000);

        manager1.setBonus(1000);

        System.out.println(manager1.toString());
        System.out.println(manager1.getSalary());

        Employee[] staffs = new Employee[3];
        Manager boss = new Manager("Aditya", 9000);

        staffs[0] = boss;
    }

}
