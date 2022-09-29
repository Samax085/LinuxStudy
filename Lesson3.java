package homework.java;

public class Lesson3 {
    public static void main(String[] args) {
        long yearInSec = 3_011_456_567L;
        int secInMinute = 60;
        int minutesInHouer = 60;
        int secInHouer = secInMinute * minutesInHouer;
        int houerInDay = 24;
        int secInDay = secInHouer * houerInDay;
        int dayInYear = 365;
        int secInYear = secInDay * dayInYear;
        long lifeInYear = yearInSec / secInYear;
        System.out.println("Феликс прожил " + lifeInYear + " лет");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Task 2");
        boolean asterix = true;
        int brew = 3;
        boolean goodBrew = (brew > 5);
        boolean goodPotion = goodBrew || asterix;
        System.out.println(goodPotion);
    }
}