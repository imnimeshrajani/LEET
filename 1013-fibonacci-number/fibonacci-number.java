class Solution {
    public int fib(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) a += b;
            else b += a;
        }
        return n % 2 == 0 ? a : b;
    }
}