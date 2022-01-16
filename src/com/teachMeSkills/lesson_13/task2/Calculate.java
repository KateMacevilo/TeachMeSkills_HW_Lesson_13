package com.teachMeSkills.lesson_13.task2;

import java.util.Scanner;

class Calculate {

     static Object getResultInputStr(String s, String s2) {

        Scanner scanner = new Scanner(System.in);

        if (s.equals("1")) {

            FunctionalInterfaceClass<String> reverseStr = (string) -> {
                StringBuffer buffer = new StringBuffer(string);
                buffer.reverse();
                return String.valueOf(buffer);
            };

            return reverseStr.getResult(s2);


        } else if (s.equals("2")) {

            FunctionalInterfaceClass<Integer> factorialN = (t) -> {
                int factorial = 1;
                for (int i = 1; i <= t; i++)
                    factorial = i * factorial;
                return factorial;
            };

            int n = Integer.parseInt(s2);
            return factorialN.getResult(n);

        } else {
            System.out.println("Wrong input");

        }

        scanner.close();
        return null;
    }

}
