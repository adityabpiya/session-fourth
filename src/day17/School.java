package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student(01,"Aditya", 2);
        Student student2 = new Student(02, "Ayushma", 3);
        Student student3 = new Student(03,"Hazel", 1);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student: students) {
            System.out.println(student);
        }
        System.out.println("***************************************");


        Arrays.sort(students);
        for (Student student: students) {
            System.out.println(student);
        }
    }


}
