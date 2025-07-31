class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i=0,j=0;
        while(i<firstList.length && j<secondList.length)
        {
            if(secondList[j][0] > firstList[i][1])
            {
                i++;
            }
            else if(firstList[i][0] >secondList[j][1] )
            {
                j++;
            }
            else{
                int a= Math.max(firstList[i][0],secondList[j][0]);
                  int b= Math.min(firstList[i][1],secondList[j][1]);
                  result.add(new int[] {a,b});
                  if(firstList[i][1] <secondList[j][1])
                  {
                    i++;
                  }
                  else{
                    j++;
                  }
            }
        }
              int[][] ans = new int[result.size()][2];
        for (int k = 0; k < result.size(); k++)
         {
            ans[k] = result.get(k);
        }
        return ans;
    
}
}