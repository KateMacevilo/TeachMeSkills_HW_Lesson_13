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
        String n = scanner.next();

        if (n.equals("1")) {

            FunctionalClass<String> reverseStr = (string) -> {
                StringBuffer buffer = new StringBuffer(string);
                buffer.reverse();
                return String.valueOf(buffer);
            };

            System.out.println("Введите любое слово");
            String str = scanner.next();
            System.out.println(reverseStr.getResult(str));


        } else if (n.equals("2")) {
            FunctionalClass<Integer> factorialN = (t) -> {
                int result = 1;
                for (int i = 1; i <= t; i++)
                    result = i * result;
                return result;
            };

            System.out.println("Введите число");
            int str = scanner.nextInt();
            System.out.println(factorialN.getResult(str));

        } else {
            System.out.println("Wrong input");
        }


    }

}
