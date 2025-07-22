import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,8,7,9};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int start,int end){
        if(start>=end) return;
        int mid = start+(end-start) /2;

        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merges(arr,start,mid,end);
    }
    public static void merges(int[] arr,int start,int mid,int end){
        int n1 = mid-start+1;
        int n2 = end-mid;
        int[] left = new int[mid-start+1];
        int[] right = new int[end-mid];

        for(int i=0;i<mid-start+1;i++){
            left[i] = arr[start+i];
        }
        for(int j=0;j<end-mid;j++){
            right[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];


    }

    
}
