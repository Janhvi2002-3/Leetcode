class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        String n =s.trim();
         for (int i = n.length() - 1; i >= 0; i--){
            if(n . charAt(i)==' ')
                break;
            
            else
             len++;
            
           
        }
         return len;
    }
}