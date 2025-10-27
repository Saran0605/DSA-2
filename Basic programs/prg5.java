//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=daily-question&envId=2025-04-30
public class prg5 {

    public static void main(String[] args) {
        int[] nums = {12,134,1};
        // answer will be 2 as the numbers with even digit count are 12 and 5322
        int ans = count(nums);
        System.out.println(ans);
    }

    static int count(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        int digits = 0;
        while(nums>0){
            int rem = nums%10;
            System.out.println(rem);
            digits++;
            nums = nums/10;
        

        }
       return digits%2==0?true:false;
        
    }
}

