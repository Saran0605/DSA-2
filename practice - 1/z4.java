//check wheter one array is an subarray of other
//using two pointer approach
public class z4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3};
        boolean ans = findSub(arr1,arr2);
        System.out.println(ans);


        
    }
    private static boolean findSub(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                i++;
                j++;

            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                return false;
            }
        }
        return j==arr2.length;
    
       

    }
    
}
