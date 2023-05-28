package homework2;

//3) Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Task_3_SQL {

    public static void main(String[] args)  {

        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}" +
                ",{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}" +
                ",{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        parseStringJson(jsonString);
}

    @SneakyThrows
    private static void parseStringJson(String jsonString) {

        Object object = new JSONParser().parse(jsonString);
        JSONArray array = (JSONArray) object;

        for (Object obj : array) {
            JSONObject jsonObject = (JSONObject) obj;
            StringBuilder builder = new StringBuilder();
            builder.append("Студент ").append(jsonObject.get("Фамилия"))
                    .append(" оценка ").append(jsonObject.get("оценка"))
                    .append("по предмету")
                    .append(jsonObject.get("по предмету"));
            String sqlQuery = builder.toString();
            System.out.println(sqlQuery);
        }
    }}
