package day11;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {2,6,3,1};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
