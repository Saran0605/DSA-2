//leaders in an array
public class z8 {
    public static void main(String[] args){
        int[] arr = {16,17,4,5,1,2};
        getleader(arr);
        


    }
    private static int getleader(int[] arr){
        int max = arr[arr.length-1];
        System.out.println(max);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(arr[i]);
            }

            

        }
        return 1;


        

        
    }
    
}
