//Sorting Algorith
//Cyclic Sorting Algorithm

import java.util.Arrays;

public class prg16 {
    public static void main(String[] args) {
        int[] arr = { 5, 3,2,4,1 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctindex = arr[i] - 1;
            if (arr[i] != arr[correctindex]) {
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
    }

}
