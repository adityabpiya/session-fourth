package day2;

public class Car {


    //States
    short cylinder;
    short hp;
    float zeroToHundred;

    //Behaviour
    void isAccel;
    void isBraking;
    void isTurning;

    public static void main(String[] args) {
        Car camaro = new Car();
        Car r8 = new Car();

        camaro.cylinder = 8;
        camaro.hp = 455;
        camaro.zeroToHundred = 4;

        r8.cylinder = 10;
        r8.hp = 611;
        r8.zeroToHundred = 2.8;


    }
}
