class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count =0;
        if(n==0)
        {
            return 0;
        }
       
        for(int i =1;i< n;i++)
        {
            if(nums[i]!= nums[count])
            {
                count++;
                nums[count] =nums[i];
                
            }
        }
        return count+1;
    }
}