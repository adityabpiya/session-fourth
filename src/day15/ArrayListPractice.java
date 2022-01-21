package day15;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(15); // or this instead of (15) - - students.ensureCapacity(15);

        students.add(new Student(1, "Aditya"));
        students.add(new Student(2,"Ayu"));
        students.add(new Student(3,"Hazel"));
        students.add(new Student(4,"Loki"));
        students.add(new Student(5, "Sireej"));

//        System.out.println(students); //Shows all normal


        students.add(1, new Student(6,"Between")); //this will go inbetween id 1 and 2 as we put index 1 and pushes everything below it a step below

//        System.out.println(students); //Shows after adding in between


        students.set(1,new Student(7, "Replaced")); // we are overriding index 1 with this

//        System.out.println(students); // Shows after setting at index 1



        // Add one list in another list

        ArrayList<Student> students1 = new ArrayList<>(15);
        students1.addAll(students);

        System.out.println(students1); // Shows all of student1 array

//        students1.remove(1); // Removed the object from index 1 - - or use step below
        students1.remove(new Student(7,"Replaced")); // for this to work we need to make sure equals have been overridden
        System.out.println(students1);

        //Getting data from an array list

        Student abcd = students1.get(1);
        System.out.println(abcd);
    }

}
