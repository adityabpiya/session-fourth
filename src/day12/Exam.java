package day12;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {


        Subject [] subjects = new Subject[4];

        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<subjects.length; i++){
            subjects[i] = new Subject();
            do {
                System.out.println("Please enter subject name");
                String subjectName = sc1.nextLine();
                subjects[i].setName(subjectName);
                System.out.printf("Please enter your obtained marks in %s \n", subjectName); // %s for string, /n for next line coz its printf
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter marks in number");
                    sc.next();
                }
                subjects[i].setMarks(sc.nextInt());
            } while (subjects[i].getMarks() <= 0 || subjects[i].getMarks() > 100);
        }

        int totalMarksObtained = 0;
        for (Subject subject : subjects) {
            totalMarksObtained += subject.getMarks();
        }

        float perc = (totalMarksObtained / (subjects.length * 100f)) * 100;
        System.out.printf("Your percentage is : %5.2f ",perc);

    }

}
