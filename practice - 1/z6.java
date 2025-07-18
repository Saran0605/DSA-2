//second largest element is an array
public class z6 {
    public static void main(String[] args) {
        int[] arr = {5,3,5,2};
        int res = findseclarge(arr);
        System.out.println(res);
        
    }

    private static int findseclarge(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]!=max && arr[i]>max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
    
}
