//Equillibrium point in an array
public class z3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int res = findEq(arr);
        System.out.println(res);
        
    }

    private static int findEq(int[] arr){
        int totsum = 0;
        for(int num:arr){
            totsum+=num;
        }
        int rSum = 0;

        for(int i=0;i<arr.length;i++){
            totsum-=arr[i];
            if(rSum == totsum){
                return i;
            }
            rSum+=arr[i];

        }
        return -1;
    }


    
}
