//Order agnostic binary search
//Searching in case if we dont know the order the array sorted
public class prg7 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target  = 2;
        System.out.println(agnos(arr,target));
        
        
    }

    static int agnos(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }

            }
            else{
                if(target<arr[mid]){
                    start = mid+1;
                }
                else if(target > arr[mid]){
                    end= mid-1;
                }
            }
            
           
        }
        return -1;
         
    }
    
}
