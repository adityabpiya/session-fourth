package day17;

import java.io.Serializable;

public class Student extends Person implements Comparable<Student>, Serializable {

    public int rollNumber;

    public Student(long id, String name, int rollNumber ) {
        super(id, name);
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id=" + super.getId() +
                " name=" + super.getName() +
                " rollNumber=" + rollNumber +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.rollNumber, this.rollNumber);
    }
}
