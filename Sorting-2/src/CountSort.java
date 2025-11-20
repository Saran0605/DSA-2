import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {6,3,10,9,2,4,9,7};
        count(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void count(int[] arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int max = arr[0];
        for(int num : arr){
            if(num>max){
                max = num;
            }
        }
        int[] countArr = new int[max+1];
        for(int num:arr){
            countArr[num]++;
        }
        int index = 0;
        for(int i=0;i<=max;i++){
            while(countArr[i]>0){
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }
}
