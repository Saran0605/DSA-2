//finding element is sorted array in infinite array of numbers
//sorted array so - binary seacrh
//but start and end will be decided as chunk with target>end then normal bs
public class prg10{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 6;

        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start =  temp;
        }
        System.out.println(infinitybs(arr,target,start,end));
        ;
    }

    static int infinitybs(int []arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}