package Recursion03;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,2,3};
        int target = 4;
        int ans = find(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    static int find(int[] arr,int target,int s,int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<arr[m]){
                return find(arr,target,s,m-1);
            }
            else{
                return find(arr,target,m+1,e);
            }
        }

        if(target > arr[m] && target <=  arr[e]){
            return find(arr,target,m+1,e);


        }
        return find(arr,target,s,m-1);


    }
}
