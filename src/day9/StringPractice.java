package day9;

import java.util.Locale;

public class StringPractice {

    public static void main(String[] args) {

     String s1 = "Nepal";
     String s2 = "Nepal";
     System.out.println(s1 == s2);

     String s3 = "Ne" + "pal";
     System.out.println(s1 == s3);

     String s4 = "Ne";
     String s5 = s4 + "pal";
     System.out.println(s1 == s5);

     System.out.println("length= " + s1);
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s4));

     System.out.println("to lower case " + s1.toLowerCase());
     System.out.println("to upper case " + s1.toUpperCase());
     System.out.println("NEPAL".toLowerCase());

     System.out.println(s1.substring(2)); //removed index 0 & 1 and started from index 2
     System.out.println(s1);

     System.out.println(" Aditya Bhasu Piya ".trim()); // removed access space at the front and back
     System.out.println(s1.charAt(1)); // Gave character at index 1
     System.out.println(s1.indexOf("e")); // gave index number of char e
     System.out.println(s1.lastIndexOf("l"));





    }
}
