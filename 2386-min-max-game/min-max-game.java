class Solution {
    public int minMaxGame(int[] nums) {
    //     for(int n = nums.length; n>1 ; n -= n/2)
    //         for(int i = 0; i < n/2; i++) 
	// 	        nums[i]= i % 2==1 ? Math.max(nums[2*i], nums[2*i+1]) : Math.min(nums[2*i], nums[2*i+1]);   
    
    // return nums[0];
        int[] arr = new int[nums.length/2];
        if(nums.length == 1) 
            return nums[0];   
        
        for(int i=0;i<nums.length/2;i++) {
            arr[i] = (i % 2 == 0) ? Math.min(nums[2*i], nums[2*i+1]) : Math.max(nums[2*i], nums[2*i+1]);
        }
        return minMaxGame(arr);
    }
}