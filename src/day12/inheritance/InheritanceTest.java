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

        Executive executive = new Executive("Ayushma", 50000);

        staffs[0] = boss;

        if (staffs[1] instanceof Manager) { //Makes sure to run the codes below only after confirming staff[1] is a manager
            Manager manager = (Manager) staffs[0]; //Did this so that we could call setBonus as it wasnt allwing it to do it due to it being set as employee
            manager.setBonus(200);
        }
    }

}
