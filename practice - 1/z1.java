// find the bitonic point in an array
public class z1{
    public static void main(String[] args) {
        int[] arr = {1,3,8,12,4,2};
        int res = findbitonic(arr);
        System.out.println(res);

        
    }
    private static int findbitonic(int[] arr){
        int left = 0,right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return arr[mid];
            }
            else if(arr[mid+1]>arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}