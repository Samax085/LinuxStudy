package homework.java;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        //1) В программу (в консоль) вводится строка.
        // Найдите длину строки, если она больше 10, то выведите true, иначе false.

        //2) В программу (в консоль) вводится строка.
        // Если первый и последний символ равны - выведите true, иначе false

        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваше сообщение ");
        String myLine = sc.nextLine();
        int characters = myLine.length();
        boolean longString = characters > 10;
        System.out.println(longString);
        System.out.println("*********************************************************************");

        System.out.println("Задача 2 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String myData = scanner.nextLine();
        var fistChar = myData.charAt(0);
        var lastChar = myData.length();
        var secondChar = myData.charAt(lastChar - 1);
        boolean trueChar = fistChar == secondChar;
        System.out.println(trueChar);

        System.out.println("***********************************************************");
        //Second level: В программу вводится строка из двух букв A и B,
        // замените все буквы A на B, а все B на A. Например ABBA -> BAAB
        System.out.println("Задача 4: ");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String myLetter = scaner.nextLine();
        myLetter = myLetter.replace('A', 'a');
        myLetter = myLetter.replace('B', 'A');
        myLetter = myLetter.replace('a', 'B');
        System.out.println("With replacement - " + myLetter);

    }
}
