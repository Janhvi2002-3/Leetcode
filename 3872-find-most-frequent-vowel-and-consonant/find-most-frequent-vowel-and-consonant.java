class Solution {
    public int maxFreqSum(String s) {
       int [] freq = new int[26];
       int vow = 0 , cons = 0;
       for(char c : s.toCharArray()){
        int i = c -'a';
        freq[i]++;
        if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u'){
           vow = Math.max(vow,freq[i]);
        }
           else{
            cons = Math.max(cons,freq[i]);
           
        }
       }
       return vow + cons;
    }
}