public class a4 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4,4, 5 };
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
                
            }
            if(arr[mid]==arr[mid+1]){
                left = mid+2;
            }
            else{
                right = mid;
            }


        }
        System.out.println(arr[left]);
    }

}
