package day19;

import day17.Student;
import day17.Teacher;

import java.io.Serializable;
import java.util.logging.Logger;

public class GenericPractice {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair();
        pair.set("id", 1);

        Pair<String, String> pair1 = new Pair();
        pair1.set("name", "Aditya Piya");

        Pair<Integer, Integer> pair2 = new Pair();
        pair2.set(1,2);

        Integer[] values = {1, 5, 8, 9};
        printArray(values);

        String[] stringValues = {"A", "B", "C"};
        printArray(stringValues);

        Student student1 = new Student(01,"Aditya", 2);
        Student student2 = new Student(02, "Ayushma", 3);
        Student student3 = new Student(03,"Hazel", 1);

        var max = maximum(student1, student2, student3);

        Logger.getGlobal().info(max.toString());




//        Teacher teacher1 = new Teacher(01,"Aditya");
//        Teacher teacher2 = new Teacher(02, "Ayushma");
//        Teacher teacher3 = new Teacher(03,"Hazel");
//
//        maximum(teacher1, teacher2, teacher3);
    }

    public static <E> void printArray(E[] inputArray) {
        //Display array element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static < T extends Comparable<T> & Serializable> T maximum(T x, T y, T z) {
        T max = x; //Assume X is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // Y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; //returns the largest object
    }

}
