package Recursion03;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {4,6,8,2,44,6,81,99};
        int target = 81;
        int ans = linear(arr,target,0);
        System.out.println(ans);
    }

    static int linear(int[] arr,int target, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }

        return linear(arr,target,idx+1);
    }
}
