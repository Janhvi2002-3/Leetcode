class Solution {
    public int numPairsDivisibleBy60(int[] time) {
      
       int [] rem =new int [60];
       int count =0;
     for( int num : time)
        {
            int result = num %60;
            int complement = (60 -result)%60;
            count += rem[complement];
            rem[result]++; 
        }
       
       return count ;
    }
}