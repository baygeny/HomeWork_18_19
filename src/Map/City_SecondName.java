package Map;

import java.util.*;

public class City_SecondName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        while (true){
            System.out.println("Input a pair key (city) - value (second name)");
            String city = in.next();
            if (city.equals("end")) {
                System.out.println("That's all!");
                break;
            }

            String secondName = in.next();
            if (secondName.equals("end")) {
                System.out.println("That's all!");
                break;
            }
            map.put(city, secondName);
        }

        System.out.println(map);

        while (true) {
            System.out.println("Input a city");
            String city = in.next();
            if (city.equals("end")) {
                System.out.println("Goodbye!");
                break;
            }

            if (map.containsKey(city)) {
                System.out.println(map.get(city));
            }
            else{
                System.out.println("There is no such key in this map.");
            }
        }
    }
}
