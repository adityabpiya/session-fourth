package day10;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter score of Maths class");
        int mathScore = in.nextInt();

        System.out.println("Enter score of Science class");
        int scienceScore = in.nextInt();

        System.out.println("Enter score of Social class");
        int socialScore = in.nextInt();

        System.out.println("Enter score of English class");
        int englishScore = in.nextInt();

        System.out.println("Enter score of Nepali class");
        int nepaliScore = in.nextInt();

        int fullScore = 500;
        int totalScore = mathScore + scienceScore + socialScore + englishScore + nepaliScore;
        float perc = (((float) totalScore / (float) fullScore) * 100);

        System.out.println("Yout total score is " + totalScore);

        System.out.println("Your total percentage is " + perc);

        if (perc >= 80){
            System.out.println("Congratulation! You got Distinction");
        }else if (perc >= 60){
            System.out.println("Good job! You got First division");
        }else if (perc >= 32){
            System.out.println("You barely passed. Try harder");
        }else {
            System.out.println("You FAILED! Better luck next time");
        }



    }

}
