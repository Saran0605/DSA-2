//Sorting algorithms
//Selection Sorting Algorithms

import java.util.Arrays;

public class prg14 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int i = 0;i<arr.length;i++){
            int maxindex = max(arr,arr.length-i);
            sort(arr,maxindex,arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr,int end){
        int maxval = 0;
        for(int i = 0;i<end;i++){
            if(arr[i]>arr[maxval]){
                maxval = i;
            }

        }
        return maxval;
    }
    static void sort(int[] arr,int maxindex,int index){
        int temp = arr[maxindex];
        arr[maxindex] = arr[index];
        arr[index] = temp;
    }
    
}
