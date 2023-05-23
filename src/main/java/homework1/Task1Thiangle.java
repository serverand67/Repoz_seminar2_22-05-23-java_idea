package homework1;

// ДЗ 1 семинар от 18.05.23
// 1. Вычислить n-ое треугольного
// число(сумма чисел от 1 до n)


import java.util.Scanner;
public class Task1Thiangle {
    public void triangleNumber(int num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = sc.nextInt();
//        int n = 5;
        int result;
        result = n * (n+1) / 2;
        System.out.println("Триугольное число, числа " + n + " являестся " + result);
        sc.close();
    }
}
