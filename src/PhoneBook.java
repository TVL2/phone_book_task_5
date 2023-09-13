import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private final HashMap<String, Set<String>> data = new HashMap<>();

    public String get(String name) {
        if (data.containsKey(name)) {
            return name + " владеет телефонами " + data.get(name).toString();
        } else {
            return "Пользователь не найден!!!";
        }
    }

    public void add(String name, String phone) {
        if (!data.containsKey(name)) {
            data.put(name, new HashSet<>());
        }
        data.get(name).add(phone);
    }
}

