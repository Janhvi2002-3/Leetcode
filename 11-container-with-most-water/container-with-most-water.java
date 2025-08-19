class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int ans=0;
     int w= right-left;
        while(left<right)
        {
            int ht = Math.min(height[left] , height[right]);
            ans= Math.max(ans , ht *(right-left));
            if( height[left]<height[right] )
            {
                left++;
            }
            else{
                right--;
            }
           
        }
        return ans;
    }
}