class Solution {
    public void sortColors(int[] nums) {
        // int R = 0, G = 0, B = 0;
        // for(int i : nums)
        //     if(i == 0) R++;
        //     else if(i == 1) G++;
        //     else if(i == 2) B++;
        
        // for(int i = 0; i < nums.length; i++) {
        //     if(R-- > 0) nums[i] = 0;
        //     else if(G-- > 0) nums[i] = 1;
        //     else if(B-- > 0) nums[i] = 2;
        // }
        for (int i = 0, start = 0, end = nums.length - 1; i <= end; i++) 
            if(nums[i] == 0) swap(nums, i, start++);
            else if(nums[i] == 2) swap(nums, i--, end--);
    }
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}