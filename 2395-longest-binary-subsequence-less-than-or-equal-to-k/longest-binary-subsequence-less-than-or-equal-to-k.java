class Solution {
    public int longestSubsequence(String s, int k) {
    
    int n = s.length();
    int countZeros = 0;
    int bitsUsed = 0;
    long value = 0;
    
    for (char c : s.toCharArray()) 
    {
        if (c == '0') countZeros++;
    }

    for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i) == '1') {
            long bitValue = 1L << bitsUsed;
            if (value + bitValue <= k) {
                value += bitValue;
                bitsUsed++;
            } else {
                
                continue;
            }
        } else {
          
            bitsUsed++;
        }

        if (bitsUsed > 32) break;
    }

    return countZeros + Long.bitCount(value);
}

    }
