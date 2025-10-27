//ceiling program
public class prg12 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,11};
        int target = 6;
        System.out.println(ceil(arr,target));
    }
    static int ceil(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    
}
