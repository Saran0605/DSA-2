package Variants;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,15,16,18};
        int target = 15;
        System.out.println(findCeil(arr,target));
    }
    public static int findCeil(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>=target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;

    }
}
