package Problems;

import java.util.Stack;


public class LongestRectAreaHist {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRec(heights));

    }

    public static int largestRec(int[] heights){
        Stack<Integer> st = new Stack<>();
        int max = 0;

        st.push(0);

        for(int i=1;i<heights.length;i++){
            while (!st.isEmpty() && heights[i] < heights[st.peek()]){
                max = getMax(heights,st,max,i);
            }
            st.push(i);
        }

        int i = heights.length;
        while (!st.isEmpty()){
            max = getMax(heights,st,max,i);
        }


        return max;

    }

    static int getMax(int[] arr,Stack<Integer> st,int max, int i){
        int area;
        int popped = st.pop();
        if(st.isEmpty()){
            area = arr[popped] * i;
        }
        else{
            area = arr[popped] * (i-1-st.peek());
        }
        return Math.max(area,max);
    }

}
