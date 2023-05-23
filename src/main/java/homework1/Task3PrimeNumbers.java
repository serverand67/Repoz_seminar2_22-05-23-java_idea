package homework1;
// ДЗ 1 семинар от 18.05.2023
// 3. Вывести все простые числа от 1 до 1000

public class Task3PrimeNumbers {
    public static void main(String[] args) {
        int number = 1000;
        for(int i = 2; i < number; ++i){
            int count = 0;
            for(int j = 2; j <= i && count < 2;++j){
                if(i % j == 0){
                    ++count;
                }
            }
            if(count<2)
                System.out.print(i + " ");
        }
    }
}

// Вывод 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97