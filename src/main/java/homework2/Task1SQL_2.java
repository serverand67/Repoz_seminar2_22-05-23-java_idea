package homework2;
//  1) Дана строка sql-запроса "select * from students where ".
//  Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json-строки.
//  Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// 3 вариант
import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class Task1SQL_2 {

    public static void main(String[] args)  {

        String jsonString = "[{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}]";
        parseStringJson(jsonString);
}

    @SneakyThrows
    private static void parseStringJson(String jsonString) {

        Object object = new JSONParser().parse(jsonString);
        JSONArray array = (JSONArray) object;

        // Формируем часть WHERE запроса из данной строки
        for (Object obj : array) {
            JSONObject jsonObject = (JSONObject) obj;
            StringBuilder builder = new StringBuilder();
                // Добавляем параметр в запрос
            builder.append(" name = ").append(jsonObject.get("name"))
                    .append(" AND ").append(" country = ")
                    .append(jsonObject.get("country"))
                    .append(" AND ").append("city = ")
                    .append(jsonObject.get("city"));
            // Добавляем к запросу WHERE и часть запроса с параметрами
            String sqlQuery = "SELECT * FROM students WHERE " + builder;
            System.out.println(sqlQuery);
      }
    }

}

