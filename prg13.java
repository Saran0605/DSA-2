//Sorting Algorithm
//Bubble Sorting Algorithm

import java.util.Arrays;

public class prg13 {
    public static void main(String[] args) {
        int arr[] = {-34,-12,9,0,45};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        
        for(int i = 0;i<arr.length;i++){
            boolean swapped = false;
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
    
}


//time Complexity = O(n^2) Always Worst nga this is😂
//may be sorted vantha O(n) we can tryyyyy...😶‍🌫️
