class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE, ans = 1, count = 0;
        for(int i = 0; i < nums.length; i++) if(max < nums[i]) max = nums[i];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == max) 
                ans = Math.max(ans, ++count);
             else count = 0;
        }
        return ans;
    }
}