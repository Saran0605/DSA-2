//find k th smallest element using min heap
import java.util.*;
public class z2 {
    public static void main(String[] args) {
        int[] arr = {5,7,3,9,8};
        int k = 1;
        int res = findkth(arr,k);
        System.out.println(res);
    
        
    }

    private static int findkth(int[] arr,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num:arr){
            heap.add(num);
        }

        for(int i=1;i<k;i++){
            heap.poll();
        }
        return heap.peek();

    }
    
}
