//largest digit from an array

import java.util.Arrays;

public class z7 {
    public static void main(String[] args) {
        int[] arr = {1,9,7,8};
        int n = findlargedigit(arr);
        System.out.println(n);
    }

    private static int findlargedigit(int[] arr){
        int[] count = new int[10];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
        }
        System.out.println(Arrays.toString(count));
        int digit = 0;
        for(int j=count.length-1;j>=0;j--){
            while(count[j]!=0){
                 if(count[j]>0){
                digit = digit*10+j;


            }
            count[j]--;

            }
           
        }
        return digit;
        
    }
    
}
