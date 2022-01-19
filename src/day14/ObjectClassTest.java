package day14;

public class ObjectClassTest {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Ayu");
        Student student2 = new Student(1,"Ayushma");

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.equals(student2));
    }

}
