package RangeQuery;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int n = arr.length;

        int sqrt = (int) Math.sqrt(n);

        int blocks_id = -1;

        int[] blocks = new int[sqrt + 1];

        for (int i = 0; i < n; i++) {
            //new block is starting
            if (i % sqrt == 0) {
                blocks_id++;
            }
            blocks[blocks_id] += arr[i];
        }
        update(blocks,arr,7,2,sqrt);

        int ans = query(blocks,arr,2,7,sqrt);

        System.out.println(ans);

    }

    public static int query(int[] blocks, int[] arr,int l,int r,int sqrt){
        int ans = 0;

        while(l % sqrt !=0  && l<r && l!=0 ){
            ans += arr[l];
            l++;

        }
        while(l + sqrt <= r){
            ans+=blocks[l/sqrt];
            l+=sqrt;
        }

        while(l<=r){
            ans+=arr[l];
            l++;

        }
        return ans;
    }
    public static void update(int[] blocks, int[] arr,int i,int val,int sqrt){
        int block_id = i /sqrt;
        blocks[block_id] += (val - arr[i]);
        arr[i] = val;
    }
}
