import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = {7,7,8,4,5};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start>=end) return;
        int pivot = partition(arr,start,end);
        quicksort(arr, start, pivot-1);
        quicksort(arr, pivot+1, end);
    }
    public static int partition(int[] arr,int start,int end){
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
