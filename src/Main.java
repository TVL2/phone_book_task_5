
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words = {"1", "3", "2", "4", "5", "7", "6", "8", "1", "4"};
        theNumberOfRepetitionsOfWordsInTheArray(words);
        uniqueWords(words);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "8 921-111-11-11");
        phoneBook.add("Петров", "8 921-111-11-22");
        phoneBook.add("Сидоров", "8 921-111-11-33");
        phoneBook.add("Сидоров", "8 921-111-11-44");
        System.out.println(phoneBook.get("Маша"));
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("Петров"));
    }


    private static HashMap<String, Integer> convertAnArrayToAMap(String[] words){
        HashMap<String, Integer> data = new HashMap<>();
        for (String word : words) {
            if (data.containsKey(word)) {
                data.put(word, data.get(word) + 1);
            } else {
                data.put(word, 1);
            }
        }
        return data;
    }

    private static void theNumberOfRepetitionsOfWordsInTheArray(String[] words) {
        HashMap<String, Integer> data = convertAnArrayToAMap(words);

        for (String key : data.keySet()) {
            System.out.println(key + " встречается " + data.get(key));
        }
    }

    private static void uniqueWords(String[] words) {
        HashMap<String, Integer> data = convertAnArrayToAMap(words);
        System.out.println("Список уникальные элементы " + data.keySet());
    }
}