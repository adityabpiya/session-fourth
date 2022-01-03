package day8;

public class ImplicitTypeCasting {

    public static void main(String[] args) {

        byte b = 100; //No explicit casting needed
        short s = b; //No explicit casting needed
        int i = s; //No explicit casting needed
        long l = i; //No explicit casting needed
        float f = l; //No explicit casting needed
        double d = f; //No explicit casting needed

        System.out.println("Byte value is: " + b);
        System.out.println("Short value is: " + s);
        System.out.println("Int value is: " + i);
        System.out.println("Long value is: " + l);
        System.out.println("Float value is: " + f);
        System.out.println("Double value is: " + d);


        char ch1 = 'A';
        double d1 = ch1;
        System.out.println(d1); //Prints 65 which is ascii code of 'A'
        System.out.println(ch1*ch1); // Prints 65 x 65 = 4225

        double d2 = 97.0;
        char ch2 = (char) d2;
        System.out.println(ch2); //Prints 'a', whose ascii code is 97.0

    }
}
