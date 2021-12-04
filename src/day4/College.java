package day4;

import java.util.ArrayList;

public class College {

    public static void main(String[] args) {
        Student student = new Student();


        Teacher teacher = new Teacher();

        Person person = new Student();
        Person person1 = new Teacher();


        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Student());
        arrayList.add(new Teacher());

    }

}
