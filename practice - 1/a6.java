import java.util.*;
public class a6 {
    public static void main(String[] args) {
        int[] arr = {7,4,5,3,2,6,1};
        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int i = 0;
        while(left<right){
            arr1[i] = arr[right];
            i++;
            arr1[i] = arr[left];
            i++;
            left++;
            right--;
            
            
        }
        if(left == right){
            arr1[i] = arr[left];
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}
