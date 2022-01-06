package day10;

public class ConditionalPractice {

    public static void main(String[] args) {
        int sales = 20;
        int target = 10;
        if (sales >= 2 * target) {
            System.out.println("1000 Bonus");
        }else if(sales >= 1.5 * target){
            System.out.println("500 Bonus");
        }else if(sales >= target) {
            System.out.println("100 Bonus");
        }
        else {
            System.out.println("You're fired");
        }

    }

}
