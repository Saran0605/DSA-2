package Recursion03;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,89,9,12};
        System.out.println(checkSorted(arr,0));
    }

    private static boolean checkSorted(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        return  arr[idx] < arr[idx+1] && checkSorted(arr,idx+1);
    }
}
