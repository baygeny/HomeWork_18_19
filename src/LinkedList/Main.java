package LinkedList;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinListMinNumber min = new LinListMinNumber();
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer");
         int minNumber = min.getMinimum(min.getIntegerList(in.nextInt()));
        System.out.println("Min number in the list is " + minNumber);
        Collection<Integer> collection = new ArrayList<>();

    }
}
