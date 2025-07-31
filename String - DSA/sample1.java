public class sample1 {
    public static void main(String[] args){
        int[][] arr = {{1,5,3},{2,9,4},{3,6,1},{2,7,5}};
        findmin(arr);
    }
    private static void findmin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length;i++){
            int tot = 0;
            for(int j=0;j<arr.length;j++){
                tot+=arr[j][i];
            }
            if(tot<min){
                min = tot;
            }
        }
        System.out.println(min);
        

          
    }
    
}
