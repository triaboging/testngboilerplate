import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Simle {
    public static void main(String[] args) {
        firstMethod();
    }
    public static void firstMethod(){
        int[] arr = {1,2,3,4,5,6,7,45};
        int count = (int) Arrays.stream(arr).filter(x->x<5).sum();
        System.out.println(count);
        ArrayList<Integer> arrr = new ArrayList<>();
        arrr.add(1);
        arrr.add(2);
        Collections.addAll(arrr, 5,6,7);
        System.out.println(arrr);
       ArrayList<Integer> a = arrr.stream().filter(x-> x<3).collect(Collectors.toCollection(ArrayList::new));

    }
}
