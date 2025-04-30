//search in an 2d Array

import java.util.Arrays;

public class prg4 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        int target = 5;
        System.out.println(Arrays.toString(searchin2d(arr,target)));
    }

    static int[] searchin2d(int[][] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                if(nums[i][j]==target){
                    return new int[]{i,j};
                }
            } 

        }
        return new int[]{-1,-1};

    }


    
}
