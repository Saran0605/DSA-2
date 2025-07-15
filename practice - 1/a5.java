import java.util.Arrays;

public class a5{
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int[] arr1 = new int[arr.length];
        int i = arr.length-2;
        int max = arr[arr.length-1];
        arr1[i+1] = -1;
        while(i>=0){
            arr1[i] = max;

            if(arr[i]>max){
                max = arr[i];
                
            }
            i--;

        }
        System.out.println(Arrays.toString(arr1));
    }
}