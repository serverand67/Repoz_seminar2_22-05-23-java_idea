package homework2;

import org.json.simple.JSONObject;

//  1) Дана строка sql-запроса "select * from students where ".
//  Сформируйте часть WHERE этого запроса, используя StringBuilder.
//  Данные для фильтрации приведены ниже в виде json-строки.
//  Если значение null, то параметр не должен попадать в запрос.
//  Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1SQL {
//    private String jsonData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
////    private String jsonData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//    public static void main(String jsonData) {
//
//        // Парсим строку
//        JSONObject parse = new JSONObject(jsonData);
//
//        // Формируем часть WHERE запроса из данной строки
//        StringBuilder whereClause = new StringBuilder();
//        for (String key : parse.keySet()) {
//            String value = parse.getString(key);
//
//            // Если значение null, то не попадает
//            if (!value.equals("null")) {
//                // Если есть параметры в запросе, то добавляем "AND"
//                if (whereClause.length() > 0) {
//                    whereClause.append(" AND ");
//                }
//                // Добавляем параметр в запрос
//                whereClause.append(key);
//                whereClause.append("=");
//                whereClause.append("'").append(value).append("'");
//            }
//        }
//
//        // Добавляем к запросу WHERE и часть запроса с параметрами
//        String sqlQuery = "SELECT * FROM students WHERE " + whereClause.toString();
//
////    }
////    String sql = "select * from students where ";
////    String jsonData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
////
////    JSONObject filters = new JSONObject(jsonData);
////
////    StringBuilder whereClause = new StringBuilder();
////
////    for (String key : filters.keySet()) {
////        String value = filters.getString(key);
////
////        if (!value.equals("null")) {
////            if (whereClause.length() > 0) {
////                whereClause.append(" AND ");
////            }
////
////            whereClause.append(key);
////            whereClause.append("=");
////            whereClause.append("'").append(value).append("'");
////                    }
////                }
////
////            String sqlQuery = sql + whereClause.toString();
////
////        System.out.println(sqlQuery);
//
  }

