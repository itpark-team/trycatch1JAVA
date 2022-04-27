package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number = 0;
        double result = 0;
        boolean inputResult;

        do {
            System.out.print("введите число (больше или равно 0): ");
            try {
                inputResult = true;
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();

                if (number < 0) {
                    throw new IllegalStateException();
                }
            } catch (InputMismatchException e) {
                System.out.println("ошибка, вы ввели не число");
                inputResult = false;
            } catch (IllegalStateException e) {
                System.out.println("ошибка, вы ввели отрицательное число");
                inputResult = false;
            } finally {
                System.out.println("finally");
            }
        } while (inputResult == false);

        result = Math.sqrt(number);
        System.out.println("квадратный корень числа " + number + " = " + result);
    }
}
