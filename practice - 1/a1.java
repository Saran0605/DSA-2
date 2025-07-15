//finding missing number 


public class a1 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {0,1,2,3};
        int ans = findmiss(arr,n);
        System.out.println(ans);
    }
    static int findmiss(int[] arr,int n){
        int i = 0;
        while(i<arr.length){
            int index = arr[i];
            if(arr[i]!=index){
                int temp = i;
                i = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }
    
}
