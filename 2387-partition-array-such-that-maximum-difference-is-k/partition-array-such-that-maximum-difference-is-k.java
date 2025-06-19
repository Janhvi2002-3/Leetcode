class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int res=nums[0];
        for(int i =0;i< nums.length;i++)
        {
            if(nums[i]-res>k)
            {
                ans++;
                res=nums[i];
            }
        }
        return ans;
    }
}