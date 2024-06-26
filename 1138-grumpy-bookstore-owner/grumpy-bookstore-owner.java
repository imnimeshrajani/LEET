class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0, n = grumpy.length, sum = 0, max = 0, start = 0, end = 0;
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) {
                ans += customers[i];
                customers[i] = 0;
            }
        }
        while(end < n) {
            sum = (minutes > 0) ? sum + customers[end++] : sum - customers[start++];
            minutes += (minutes > 0) ? -1 : 1;
            max = Math.max(max, sum);
        }
        return ans + max;
    }
}