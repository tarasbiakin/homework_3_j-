import java.util.*;
public class ListSotring {
    public static Object[] SortVal(){

        ArrayList arraylist = new ArrayList();
        Random random = new Random();
        int[] array = random.ints(12, 1,10).toArray();
        for (int i = 0; i< array.length; i++){
            arraylist.add(array[i]);
        }
//        System.out.println("До сортировки:");
//        for (Object counter : arraylist) {
//            System.out.println(counter);
//        }
        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);
//        System.out.println("После сортировки:");
//        for (Object counter : arraylist) {
//            System.out.println(counter);
//
//        }

        Object[] Arr1 =arraylist.toArray();

        return Arr1;
    }


    public static void main(String[] args) {

        Object[] result=SortVal();//ListRan(array);
//        for (int r : result) {
//            System.out.println(r);
//        }
        System.out.println(Arrays.toString(result));

        System.out.println("Минимальное значение " +result[0]);
        System.out.println("Максимальное значение " +result[result.length-1]);
        int sum = 0;
        for (int i= 0; i< result.length;i++){
            sum+=i;
        }
        System.out.println("Среднее значение "+ sum/ result.length);
//




    }
}
