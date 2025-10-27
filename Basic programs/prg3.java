public class prg3 {

    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,20};
        System.out.println(mini(arr));
    }

    static int mini(int[] arr){
        //only if the array is not empty we can set first value as inital minimum
        //or
        int ans = Integer.MAX_VALUE;
        /* int ans = arr[0]; */
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}   
