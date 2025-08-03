import java.util.Arrays;

public class prg5 {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        int j = 0;
        for(int i=arr1.length;i<arr3.length;i++){
            arr3[i] = arr2[j];
            j++;
        }
        Arrays.sort(arr3);
        double ans = findmed(arr3);
        System.out.printf("%.5f", ans);
    }

    static double findmed(int[] arr){
        int len = arr.length;
        if(len%2==0){
            return ((arr[len/2])+(arr[len/2-1]))/2.0;
        }
        else{
            return (arr[len/2]);
        }
    }
    
}
