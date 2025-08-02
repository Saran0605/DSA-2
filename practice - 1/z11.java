import java.util.*;
public class z11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Pattern";
        String ans = reverseVow(s.toCharArray());
        System.out.println(ans);
        
    }

    static String reverseVow(char[] arr){
        int left = 0;
        int right = arr.length-1;
        Set<Character> list = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        while(left<right){
            
            if(!(list.contains(Character.toLowerCase(arr[left])))){
                left++;
            }
            else if(!(list.contains(Character.toLowerCase( arr[right])))){
                right--;
            }
            else{
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);


    }
    
}
