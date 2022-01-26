package day16;

import java.util.EnumSet;

public class EnumPractice {

    public static void main(String[] args) {

        var emptyList = EnumSet.noneOf(WeekDay.class);
        System.out.println(emptyList);

        var allList = EnumSet.allOf(WeekDay.class);
        System.out.println(allList);

        var rangeList = EnumSet.range(WeekDay.MONDAY,WeekDay.FRIDAY);
        System.out.println(rangeList);

        var specificList = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        System.out.println(specificList);

        var complementList = EnumSet.complementOf(specificList); //lists objects that not in specificList
        System.out.println(complementList);

        System.out.println(WeekDay.MONDAY.getAbbrev());
    }

}
