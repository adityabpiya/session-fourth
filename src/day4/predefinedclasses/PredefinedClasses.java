package day4.predefinedclasses;

import java.util.Date;

public class PredefinedClasses {

    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.round(0.49));
        System.out.println(Math.floor(0.49));
        System.out.println(Math.ceil(0.49));

        System.out.println(Math.sqrt(16));

        Date today = new Date();
        System.out.println(today);

    }

}
