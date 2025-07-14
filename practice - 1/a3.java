public class a3{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4};

        int left = 0,right = arr2.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr1[mid]==arr2[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println(arr1[left]);
    }
}