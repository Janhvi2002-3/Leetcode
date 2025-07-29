class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenPow = pow(5, even);
        long oddPow = pow(4, odd);

        return (int)((evenPow * oddPow) % MOD);
    }

    private long pow(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp % 2) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}
