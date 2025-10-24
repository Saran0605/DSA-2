import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};
        bubble1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble1(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2!=0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2!=0 && arr[i] > arr[j]){
                        swap(arr,i,j);
                    }
                }
            }
        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2==0 && arr[i] < arr[j]){
                        swap(arr,i,j);
                    }
                }
            }
        }

    }
    static void swap(int[] arr,int left,int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}