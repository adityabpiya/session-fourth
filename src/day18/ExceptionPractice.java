package day18;

import java.io.IOException;

public class ExceptionPractice {

    public void readFromFile() throws IOException {
        throw new IOException("Oops readFromFile is throwing an exception");
    }

    public void running() throws RuntimeException {
        throw new RuntimeException("Oops running is throwing an exception");
    }

    public static void main(String[] args) {
        ExceptionPractice exceptionPractice = new ExceptionPractice();   //we cant call a method here directly coz we can only call static function in static method

        try {
            exceptionPractice.readFromFile();
            System.out.println("In between read from file and running");
            exceptionPractice.running();
        } catch (IOException e) {
            System.out.println("In catch block of IOException");
            e.printStackTrace(); //displays the message of exception .. its a method that is called by exceptions
        }

//        try {
//            exceptionPractice.running();
//        } catch (RuntimeException e){
//            e.printStackTrace();
//        }
    }

}
