package day10;

import java.util.Scanner;

public class StudentGradesV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int maths = 0;

        do{
            System.out.println("Please enter marks obtained in maths ");
            while (!sc.hasNextInt()){
                System.out.println("Please enter marks in number");
                sc.next();
            }
            maths = sc.nextInt();
        } while (maths<=0 || maths>100);


        int science = 0;

        do{
            System.out.println("Please enter marks obtained in Science");
            while (!sc.hasNextInt()){
                System.out.println("Please enter marks in number");
                sc.next();
            }
            science = sc.nextInt();
        } while (science<=0 || science>100);


        int social = 0;

        do{
            System.out.println("Please enter marks obtained in Social");
            while (!sc.hasNextInt()){
                System.out.println("Please enter marks in number");
                sc.next();
            }
            social = sc.nextInt();
        } while (social<=0 || social>100);


        int english = 0;

        do{
            System.out.println("Please enter marks obtained in English");
            while (!sc.hasNextInt()){
                System.out.println("Please enter marks in number");
                sc.next();
            }
            english = sc.nextInt();
        } while (english<=0 || english>100);


        int nepali = 0;

        do{
            System.out.println("Please enter marks obtained in Nepali");
            while (!sc.hasNextInt()){
                System.out.println("Please enter marks in number");
                sc.next();
            }
            nepali = sc.nextInt();
        } while (nepali<=0 || nepali>100);

        int fullScore = 500;
        int obtScore = maths + science + social + english + nepali;
        float perc = (((float) obtScore / (float) fullScore) * 100);



        System.out.println("You got " + maths + " out of 100 in Maths");
        System.out.println("You got " + science + " out of 100 in Science");
        System.out.println("You got " + social + " out of 100 in Social");
        System.out.println("You got " + english + " out of 100 in English");
        System.out.println("You got " + nepali + " out of 100 in Nepali");


        if (perc >= 80){
            System.out.println("Congratulation! You got Distinction");
        }else if (perc >= 60){
            System.out.println("Good job! You got First division");
        }else if (perc >= 32){
            System.out.println("You barely passed. Try harder");
        }else {
            System.out.println("You FAILED! Better luck next time");
        }

        System.out.printf("Your percentage is: %5.2f ", perc);

//        int[] marks = new int[5];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i<marks.length;i++){
//            do{
//                System.out.println("Please enter a positive number");
//                while (!sc.hasNextInt()){
//                    System.out.println("thats not a number");
//                    sc.next(); //This is important
//                }
//                marks[i] = sc.nextInt();
//            } while (marks[i]<=0 || marks[i]>100);
//            System.out.println("You got " + marks[i]);
//        }
//        System.out.println("U got " + marks);

    }

}
