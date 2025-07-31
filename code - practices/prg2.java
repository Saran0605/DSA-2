import java.util.Arrays;

public class prg2 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 8, 7, 4};
        quick(arr,0,arr.length-1);

    }
    private static void quick(int[] arr,int start,int end){
        if(start>=end) return;
        int pivot = partition(arr,start,end);
        quick(arr,start,pivot-1);
        quick(arr,pivot+1,end);

    }
    private static int partition(int[] arr,int start,int end){
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<arr[end]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }
    
}
