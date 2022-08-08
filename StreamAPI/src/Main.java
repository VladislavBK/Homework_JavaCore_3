import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.addAll(intList);
        Collections.sort(intArrayList);
        intArrayList.removeIf(i -> (i <= 0 || i % 2 != 0));
        System.out.println(intArrayList);

    }
}
