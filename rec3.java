//Binary search using recurssion
public class rec3 {
    public static void main(String[] args) {
        int[] arr = {12,14,16,18,20};
        int target = 18;
        int ans = binary(arr,target,0,arr.length-1);
        System.out.println(ans);

        
    }
    static int binary(int[] arr,int target,int s,int e){
       
        int m = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==target){
            return m;
        }
        else if(arr[m]>target){
            return binary(arr,target,s,m-1);
        }
            return binary(arr,target,m+1,e);
        


        


    }
    
}
