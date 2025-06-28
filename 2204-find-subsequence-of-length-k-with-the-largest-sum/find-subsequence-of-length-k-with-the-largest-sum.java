class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int [][] pair= new int[n][2];
        for(int i =0;i< n;i++)
        {
            pair[i][0]=nums[i];
            pair[i][1]=i;
        }
       
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);
         Arrays.sort(pair, 0, k, (a, b) -> a[1] - b[1]);

         int[]res=new int [k];
         for(int i=0;i<k;i++)
         {
            res[i] = pair[i][0];
         }
         return res;
    }
}