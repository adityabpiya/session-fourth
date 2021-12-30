package day6;

public class Counter {

    private static int personCount;

    private Counter () {}

    public static void increaseCount(){

        personCount += 1;
    }

    public static void decreaseCount(){

        personCount -= 1;
    }

    public  static  int getCount() {
        return personCount;
    }
}
