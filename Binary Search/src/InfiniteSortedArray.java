public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,12,14,15,24,26,27};
        System.out.println(findinAns(arr,14));


    }
    static int findinAns(int[] arr,int target){
        //first find the range
        //start with the box of size 2

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end+1;

            end = end + (end-start+1)*2;
            start = newStart;
        }
        if (end >= arr.length) {
            end = arr.length - 1;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
