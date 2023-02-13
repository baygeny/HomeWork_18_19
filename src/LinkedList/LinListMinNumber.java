package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinListMinNumber {
    public LinkedList<Integer> getIntegerList(int N) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Input " + N + " integers");
        for (int i = 1; i <= N; i++) {
            list.add(in.nextInt());
        }

        return list;
    }

    public int getMinimum(LinkedList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        return min;
    }
}

