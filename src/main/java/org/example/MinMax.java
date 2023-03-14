package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MinMax {public static int[] mergeSort(int[] sortArr)
{
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);//копируем массив до половины длины
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;}

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void PrintVal(int[] array ){
        System.out.println("Минимальное значение: "+ array[0]);
        System.out.println("Минимальное значение: "+ array[array.length-1]);
        System.out.println("Среднее значение: "+(( array[array.length-1]-array[0])/2));

    }
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] array = random.ints(10, 1,10).toArray();
        for (int i = 0; i< array.length; i++){
            list.add(array[i]);
        }
        int[] result = mergeSort(array);
        System.out.println(Arrays.toString(result));
        PrintVal(result);

    }
}
