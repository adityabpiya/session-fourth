package day15;

import java.util.ArrayList;

public class ObjectWrapperPractice {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        //We are able to add these directly due to Autoboxing
        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);

        System.out.println(ints);

//        int a = ints.get(1);
//        System.out.println(a);


        for (int a : ints) {     // used enhanced for loop instead of : for (int i = 0; i < ints.size(); i++){ int a = ints.get(i);
            System.out.println(a);
        }


    }

}
