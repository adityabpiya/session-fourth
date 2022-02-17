package day19;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingPractice {

    private static final Logger myLogger = Logger.getLogger("day19");

    public static void main(String[] args) {

//        Logger.getGlobal().setLevel(Level.WARNING);
//
//        Logger.getGlobal().severe("This is severe");
//        Logger.getGlobal().warning("This is a warning");
//        Logger.getGlobal().info("This is info");
//        Logger.getGlobal().config("This is config");
//        Logger.getGlobal().fine("This is fine");
//        Logger.getGlobal().finer("This is finer");
//        Logger.getGlobal().finest("This is finest");


        myLogger.setLevel(Level.ALL);

        myLogger.severe("This is severe");
        myLogger.warning("This is warning");
        myLogger.info("This is info");
        myLogger.config("This is config");
        myLogger.fine("This is fine");
        myLogger.finer("This is finer");
        myLogger.finest("This is finest");

        //Why logger type below info isnt being shown.. find out
    }

}
