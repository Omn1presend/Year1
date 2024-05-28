package LAB_10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JsonParser parser = new JsonParser();
            Object obj =parser.parse (new FileReader("src/LAb_10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("Текущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Object parse(FileReader fileReader) {
        return null;
    }
}


