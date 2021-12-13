package day4;

import java.util.ArrayList;

public class College {

    public static void main(String[] args) {
        Student student = new Student();


        Teacher teacher = new Teacher();

        Person person = new Student();
        ((Student) person).getRollNumber();

        Person person1 = new Teacher();
        ((Teacher) person1).getSalary();

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Student());
        arrayList.add(new Teacher());
        arrayList.add(new Person());


    }

}
