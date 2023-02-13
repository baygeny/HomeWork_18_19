package String;

import java.util.ArrayList;
import java.util.Scanner;

public class IO_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> rows = new ArrayList<>();

        while (!in.hasNext("end")) {
            rows.add(in.next());
        }
        for (String i : rows) {
            System.out.println(i);
        }
    }
}
