class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2, j = 2;
        while (i<nums.length) {
            if ((nums[i] != nums[j-2])) {
                if (i!=j) nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j < 0? nums.length : j;
    }
}