package homework.java;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        //First level: С консоли считывается 3 оценки, которые Петя получил сегодня в школе.
        //Помогите ему посчитать свой средний балл, выведя его на экран.
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите ваши оценки:");
        int myRate1 = scaner.nextInt();
        int myRate2 = scaner.nextInt();
        int myRate3 = scaner.nextInt();
        int numberOfRate = 3;
        int sumOfRate = myRate1 + myRate2 + myRate3;
        int averageScore = sumOfRate / numberOfRate;
        System.out.println("Ваша средняя оценка: " + averageScore);
        System.out.println("*********************************************************");
        //Second level: Петя вырос и накопил денег на поезду на море.
        //Но он переживает, стоит ли туда ехать.
        //Если температура воздуха будет больше, чем 28 градусов,
        //а температура воды больше 26 - тогда он готов поехать на море, иначе нет.
        int waterTemperature = 27;
        int airTemperature = 29;
        boolean sufficientWaterTemp = (waterTemperature > 26);
        boolean sufficientAirTemperature = (airTemperature > 28);
        boolean answer = sufficientAirTemperature & sufficientWaterTemp;
        System.out.println("Peter is going on vacation " + answer);


    }
}
