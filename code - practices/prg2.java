import java.util.Arrays;

public class prg2 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 8, 7, 4};
        quick(arr,0,arr.length-1);
        int[] arr1 = new int[arr.length];
        int left = 0,right = arr.length-1;
        int i = 0;
        while(left<right){
            arr1[i] = arr[right];
            i++;
            arr1[i] = arr[left];
            i++;
            left++;
            right--;
        }
        arr1[i] = arr[right];
        System.out.println(Arrays.toString(arr1));

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
