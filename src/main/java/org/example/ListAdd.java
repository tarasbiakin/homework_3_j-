package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListAdd {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<1000;i++) {
            list.add(0, 0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("TArrayList " + (endTime - startTime) + " milliseconds");
//        System.out.println(list);

        long startTime1 = System.currentTimeMillis();

        LinkedList<Integer>list1 = new LinkedList<>();
        for (int i = 0;i<1000;i++) {
            list1.add(0, 0);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("LinkedList " + (endTime1 - startTime1) + " milliseconds");
//        System.out.println(list1);
    }

}
