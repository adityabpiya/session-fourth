package day17;

public class Student extends Person implements Comparable<Student>{

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
        return Integer.compare(this.rollNumber, o.rollNumber);
    }
}
