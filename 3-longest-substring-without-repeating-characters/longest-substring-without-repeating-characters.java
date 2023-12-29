class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), j = 0, ans = 0;
        char[] c = s.toCharArray();
        int[] arr = new int[128];
        for (int i = 0; i < n; i++) {
            char ch = c[i];
            j = Math.max(j, arr[ch]);
            arr[ch] = i + 1;
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}