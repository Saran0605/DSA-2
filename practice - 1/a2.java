//findiing missing number using XOR
public class a2 {
    public static void main(String[] args){
        int[] arr = {4,0,2,3};
        int n = 4;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<=n;i++){
            xor1 ^= i;
        }
        for(int i=0;i<arr.length;i++){
            xor2 ^= arr[i];

        }
        System.out.println(xor1 ^ xor2);
        
    }
    
    
}
