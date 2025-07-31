import java.util.*;
public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        reverse(arr);
        sc.close();
    }
    
    private static void reverse(char[] arr){
        reverse1(arr,0,arr.length-1);

        int start = 0;
        for(int end = 0;end<=arr.length-1;end++){
            if(arr[end]==arr.length || arr[end] == ' '){
                reverse1(arr,start,end-1);
                start = end+1;

            }
        }

        System.out.println(new String(arr));
    }

    private static void reverse1(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
