package day19;

public class GenericPractice {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair();
        pair.set("id", 1);

        Pair<String, String> pair1 = new Pair();
        pair1.set("name", "Aditya Piya");

        Pair<Integer, Integer> pair2 = new Pair();
        pair2.set(1,2);
    }

}
