package ArrayList;


import java.util.ArrayList;

public class ListOfString {
    public void doubleValues(ArrayList<String> list) {
        System.out.println("Double rows:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ", " + list.get(i));
        }
    }

}
