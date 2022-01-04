package day10;

import java.util.Scanner;

public class InputOutputTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = in.nextLine();

        System.out.println("What is your address? ");
        String address = in.next();

        System.out.println("How old are you? ");
        int age = in.nextInt();

        System.out.printf("Name is %s and age is %d " ,name ,age);
        System.out.println();
        System.out.println("Address is " + address);
//        System.out.printf("Age is %d " , age);
    }
}
