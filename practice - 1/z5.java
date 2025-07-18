//find unique digit in array using o(n) and o(1)
public class z5 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,6,5,4,2};
        int res = finduni(arr);
        System.out.println(res);

        
    }
    private static int finduni(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum ^= num;
        }
        return sum;
    }
}
