package homework2;
//  1) Дана строка sql-запроса "select * from students where ".
//  Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json-строки.
//  Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

                //2 вариант
import org.json.JSONException;
import com.fasterxml.jackson.core.JsonProcessingException;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task1SQL_1 {

    static String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    public static void main(String[] args) throws JSONException {


        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = null;
        try {
            rootNode = objectMapper.readTree(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        String name = "";
        String city = "";
        String country = "";

        JsonNode nameNode = rootNode.get("name");
        if (nameNode != null) {
             name = nameNode.asText();
        }
        JsonNode countryNode = rootNode.get("country");
        if (countryNode != null) {
             country = countryNode.asText();
        }
        JsonNode cityNode = rootNode.get("city");
        if (cityNode != null) {
             city = cityNode.asText();
        }

        String sqlQuery = "SELECT * FROM students WHERE " + "name = "+ name
                +" AND "+ "country = "+ country +" AND "+ "city = " + city + ";";
        System.out.println(sqlQuery);

    }
}
