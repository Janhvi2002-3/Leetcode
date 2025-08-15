class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
        {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
       int start =0;
       int end =0;
       for(int i =0 ;i<s.length();i++ ){
        if(set.contains(s.charAt(i)));
        while(start<i && set.contains(s.charAt(i)))
         
        {
            set.remove(s.charAt(start));
            start++;
        }
         set.add(s.charAt(i));
        end = Math.max(end,i-start+1);
       }
       return end;
    }
}