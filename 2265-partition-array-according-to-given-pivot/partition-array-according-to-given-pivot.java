class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length, pivotCount = 0, smallerCount = 0, ans[] = new int[n], start = 0;
        for (int i :  nums) 
            if(i == pivot) pivotCount++;
            else if(i < pivot) smallerCount++;
        while (pivotCount-- > 0) 
            ans[smallerCount++] = pivot;
        for(int i : nums) {
            if(i > pivot)  ans[smallerCount++] = i;
            else if(i < pivot) ans[start++] = i;
        }
        return ans;
    }
}