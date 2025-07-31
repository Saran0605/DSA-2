import java.util.*;
public class prg3 {
    public static void main(String[] args) {
        int[] arr = {3,4,3,2,2,6,7,8};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }





        
    }
    
}
