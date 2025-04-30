//Linear search program
public class prg1 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,3,77,88,56,45};
        int target = 77;
        int ans = linear(arr,target);
        System.out.println(ans);



    }
    static int linear(int[] nums,int target){
        //for initally checking the array is empty or not
        if(nums.length==0){
            return -1;
        }
        //optimized for only uses for returning element
        for(int num:nums){
            if(num==target){
                return num;
            }

        }
        //normal for loop for returning index
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        //if no such element or index fin above at last it will return -1

        return -1;
    }
    
}
