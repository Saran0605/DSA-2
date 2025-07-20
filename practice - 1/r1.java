
//find top 3 occuring number in arrar
import java.util.*;

public class r1 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5 };// op : 1,3,2
        findtop3(arr);

    }

    private static void findtop3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    }

}
