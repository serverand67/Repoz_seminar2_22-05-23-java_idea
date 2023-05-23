package homework1;
// ДЗ 1 семинар от 18.05.2023
// 4. Реализовать простой калькулятор

import java.util.Scanner;

public class Task4Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = sc.nextInt();
        System.out.println("Введите действие: +, -, /, * ");
        int operator = sc.next().charAt(0);
        System.out.println("Введите второе число ");
        int num2 = sc.nextInt();
        int result;
        if (operator == '+'){
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        if (operator == '-'){
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }
        if (operator == '*'){
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        if (operator == '/'){
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
//        else {
//            System.out.println("Вы ввели не коректные действия ");
//        }
//        sc.close();
    }
}
