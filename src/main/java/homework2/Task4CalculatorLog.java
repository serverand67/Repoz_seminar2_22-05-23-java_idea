package homework2;

//4) К калькулятору из предыдущего ДЗ добавить логирование.

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task4CalculatorLog {
    private static Logger logger = Log1.log(Task4CalculatorLog.class.getName());
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
//                System.out.println(num1 + " + " + num2 + " = " + result);
                logger.log(Level.INFO, "Результат  равен " + result);
            }
            if (operator == '-'){
                result = num1 - num2;
//                System.out.println(num1 + " - " + num2 + " = " + result);
                logger.log(Level.INFO, "Результат  равен " + result);
            }
            if (operator == '*'){
                result = num1 * num2;
//                System.out.println(num1 + " * " + num2 + " = " + result);
                logger.log(Level.INFO, "Результат  равен " + result);
            }
            if (operator == '/'){
                result = num1 / num2;
//                System.out.println(num1 + " / " + num2 + " = " + result);
                logger.log(Level.INFO, "Результат  равен " + result);
            }
//        else {
//            System.out.println("Вы ввели не коректные действия ");
//        }
//        sc.close();
        }
    }

