package day18;

public class AssertionTest {
    public static void main(String[] args) {
        int x = -2;

//        if (x < 0) {
//            throw new IllegalArgumentException("x < 0");
//        }

        assert x >= 0 : "x < 0"; //this replaces the above if statement .... have to be >=0 if not show the message after :

        System.out.println(Math.sqrt(x));
    }
}
