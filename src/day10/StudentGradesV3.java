package day10;

import java.util.Scanner;

public class StudentGradesV3 {

    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<marks.length; i++){
            do {
                System.out.println("Please enter your obtained marks");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter marks in number");
                    sc.next();
                }
                marks[i] = sc.nextInt();
            } while (marks[i] <= 0 || marks[i] > 100);
        }

        int totalMarksObtained = 0;
        for (int mark : marks) {
            System.out.printf("Mark : %d ",mark);
            totalMarksObtained += mark;
        }

        float perc = (totalMarksObtained / (marks.length * 100f)) * 100;
        System.out.printf("Your percentage is : %5.2f ",perc);

    }

}
