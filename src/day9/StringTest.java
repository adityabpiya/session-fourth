package day9;

public class StringTest {

    public static void main(String[] args) {
        String hello = "Hello";
        String helloSubString = "Hello".substring(0,3);

        System.out.println(helloSubString);

        String expletive = "Expletive ";
        String PG13 = "deleted";
        String message = expletive + PG13;

        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;

        String value = 13 + ""; //Bad way of doing -- instead use -- String.valueOf(13); -- to change int to string

        System.out.println(rating);

        String all = String.join("/","S", "M", "L", "XL" );
        System.out.println(all);

        String repeated = "Hello ".repeat(3);
        System.out.println(repeated);

        System.out.println("Hel".equals(helloSubString));

        System.out.println("Y".equalsIgnoreCase("y"));

        String empty = "    ";

        System.out.println(empty.trim().length()); //trim before checking length to not count spaces

        System.out.println(empty.isBlank());

        String nullString = null;

        if(nullString != null){
            System.out.println(nullString.length());
        }

        //While concatenating large number of Strings, use String Builder
        StringBuilder builder = new StringBuilder();
        builder.append("Hi! ");
        builder.append("I am ");
        builder.append("Learning ");
        builder.append("String Builder.");

        System.out.println(builder.toString());


    }

}
