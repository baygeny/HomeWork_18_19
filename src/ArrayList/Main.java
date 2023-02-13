package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListOfString listOfString = new ListOfString();
        ArrayList<String> list = new  ArrayList<>();
        int n = 0;
        System.out.println("Input five rows");
        while (n < 5 ) {
            list.add(in.next());
            n++;
        }
        listOfString.doubleValues(list);
    }
}


