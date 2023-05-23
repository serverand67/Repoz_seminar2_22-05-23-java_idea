package seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту
//строку в простой текстовый файл, обработайте исключения.
public class Task22 {
    private static Logger logger = Log.log(Task22.class.getName());

    // метод который записывает строку в файл
    public void write(String string){
        String str = createStr(string);
        System.out.println("длина повторяемой строки = "+ str.length());
        logger.log(Level.INFO, "Длина повторяемой строки = " + str.length());
        // 1 вариант
//        try {
//            FileWriter in = new FileWriter("test.txt");
//            in.write(str);
//            in.flush();    // главное не забывать писать эту строчку
//            System.out.println("Записано");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 2 вариант, не всегда можно использовать, только с теми классами которые
        // екстендятся (имеют расширение/имеют тип) Closeable, AutoCloseable
        try(FileWriter in = new FileWriter("test.txt");) {
            in.write(str);
            System.out.println("Записано");
            logger.log(Level.INFO,"Записано");
//            divide(2, 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // метод который создает строку
    private String createStr(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(str);
            //        builder.append(String.valueOf(str).repeat(100));    // или так вместо цикла for
        }
        return builder.toString();
    }
//    private double divide(int a, int b){
//        if (b == 0) throw new DivideByZero("На ноль делить нельзя");
//        return a / b;
//    }
}