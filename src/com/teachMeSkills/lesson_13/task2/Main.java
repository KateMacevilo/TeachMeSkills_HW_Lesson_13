package com.teachMeSkills.lesson_13.task2;

import java.util.Scanner;

/**
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом (подумать и аргмументировать решение о том будет ли это статический методо или нет)
 *
 * В этом методе реализуйте логику:
 * - если в консоль введена цифра 1, то: использования интерфейса со строковым типом
 * и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 *
 * - если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом
 * и передать в метод интерфейса логику нахождения факториала числа.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 или 2");
        String n = scanner.next();

        if (n.equals("1")){
            System.out.println("Введите любое слово");
            String s = scanner.next();
            Object obj = Calculate.getResultInputStr(n, s);
            System.out.println("Реверс строки: " + obj);

        } else if (n.equals("2")){
            System.out.println("Введите число");
            String str = scanner.next();
            Object obj2 = Calculate.getResultInputStr(n, str);
            System.out.println("Факториал числа = "+ obj2 );
        }

        scanner.close();


    }

}
