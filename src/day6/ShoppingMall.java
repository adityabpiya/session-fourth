package day6;

public class ShoppingMall {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();



        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());

        counter1.increaseCount();
        counter2.increaseCount();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());

        counter3.decreaseCount();
        counter4.decreaseCount();

        System.out.println(counter1.getCount());
        System.out.println(counter2.getCount());
        System.out.println(counter3.getCount());
        System.out.println(counter4.getCount());
    }
}
