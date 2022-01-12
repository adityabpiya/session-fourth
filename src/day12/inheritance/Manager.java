package day12.inheritance;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary){
        super(name, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + bonus;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
