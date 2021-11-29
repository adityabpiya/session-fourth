package day2;

public class Lift {

    //states
    short numberOfFloors;
    short numberOfPersons;
    float totalWeight;

    //Behaviour
    void isGoingUp(){}
    void isGoingDown(){}
    void doorOpening(){}

    public static void main(String[] args){
        Lift lift1 = new Lift();
        Lift lift2 = new Lift();

        lift1.numberOfFloors = 10;
        lift1.numberOfPersons = 8;
        lift1.totalWeight = 500;

        lift2.numberOfFloors = 5;
        lift2.numberOfPersons = 4;
        lift2.totalWeight = 250;



    }

}
