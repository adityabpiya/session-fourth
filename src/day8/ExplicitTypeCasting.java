package day8;

public class ExplicitTypeCasting {

    public static void main(String[] args) {

        double d = 100.4;
        float f = (float) d; //Explicit casting is needed
        long l = (long) f; //Explicit casting is needed
        int i = (int) l; // Explicit casting is needed
        short s = (short) i; //Explicit casting is needed
        byte b = (byte) s; //Explicit casting is needed


        System.out.println("Double value is: " + d);
        System.out.println("Float value is: " + f);
        System.out.println("Long value is: " + l);
        System.out.println("Int value is: " + i);
        System.out.println("Short value is: " + s);
        System.out.println("Byte value is: " + b);

        byte bb = (byte) 200; // Converting short '200' to byte
        System.out.println(bb);

    }

}
