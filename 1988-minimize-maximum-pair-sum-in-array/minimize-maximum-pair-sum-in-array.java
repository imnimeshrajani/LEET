class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1, max = 0;
        while(i<j) max = Math.max(max, nums[i++]+nums[j--]);
        return max;
    }
}