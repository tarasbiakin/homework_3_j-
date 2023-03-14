import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class JoinList {
    public static Object[] CollectionJoin(){
        Collection<Integer> col1 = new ArrayList<Integer>();


        col1.add(1);
        col1.add(2);
        col1.add(3);

        Collection<Integer> col2 = new ArrayList<Integer>();

        col2.add(3);
        col2.add(4);
        col2.add(5);
        col2.add(1);

//        col1.retainAll(col2);//пересечение
//        col1.addAll(col2);//добавление
        col1.removeAll(col2);//удаление того что есть в аргументе
        System.out.println(col1);

//output for ArrayList: [a, b, c, b, c, d, e]
//output for TreeSet: [a, b, c, d, e]

        return null;
    }
    public static void main(String[] args) {


        CollectionJoin();
    }
}
