package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Arrays;

public class List {
    public static Object[] ListRan(int[]arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i< arr.length; i++){
            list.add(arr[i]);
        }
//        System.out.println(list);
//без итератора не удалялись некоторые четные числа

                for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
//                System.out.println("не четное  число: " + number);
                list1.add(number);
            }
        }

        Object[] Arr1 =list1.toArray();
//        System.out.println(list1);
        return Arr1;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(10, 1,10).toArray();
        Object[] result=ListRan(array);
//        for (int r : result) {
//            System.out.println(r);
//        }
        System.out.println(Arrays.toString(result));

    }
}
