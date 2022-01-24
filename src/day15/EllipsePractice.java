package day15;

public class EllipsePractice {

    public static void main(String[] args) {
        add(1,2);
        add(1, 2, 5);
        add(1,2,5,10);
    }

//    public static void add(int a, int b){
//        int c = a + b;
//        System.out.println(c);
//    }
//
//    public static void add(int a, int b, int c){
//        int temp = a + b + c;
//        System.out.println(temp);
//    }
//
//    public static void add(int a, int b, int c, int d){
//        int temp = a + b + c + d;
//        System.out.println(temp);
//    }

    public static void add(int... ints){   ///...operator converts the premitive data type to object
        System.out.println(ints);
        int temp = 0;
        for (int a : ints) {
             temp += a;
        }
        System.out.println(temp);

    }

}
