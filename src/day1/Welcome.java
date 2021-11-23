package day1;
public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java session fourth 2021!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
    }
}