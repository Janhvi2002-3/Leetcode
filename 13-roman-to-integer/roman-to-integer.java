class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romap=new HashMap<>();
        romap.put('I', 1);
        romap.put('V', 5);
        romap.put('X', 10);
        romap.put('L', 50);
        romap.put('C', 100);
        romap.put('D', 500);
        romap.put('M', 1000);
        int n=s.length();
        int result =0;
        for(int i=0;i<n;i++){
         int curt=romap.get(s.charAt(i));
         if( i< n-1 && curt < romap.get(s.charAt(i+1)) ){
         result -=curt;
        }
        else{
            result +=curt;
        }
        }
           return result;

    }
}