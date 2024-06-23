class Solution {
    public int longestSubarray(int[] nums, int limit) {
        LinkedList<Integer> increase = new LinkedList<>(), decrease = new LinkedList<>();
        int max = 0, left = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            while (increase.size() > 0 && n < increase.getLast()) 
                increase.removeLast();
            
            increase.add(n);

            while (decrease.size() > 0 && n > decrease.getLast()) 
                decrease.removeLast();
            
            decrease.add(n);

            while (decrease.getFirst() - increase.getFirst() > limit) {
                if (nums[left] == decrease.getFirst()) 
                    decrease.removeFirst();
                
                if (nums[left] == increase.getFirst()) 
                    increase.removeFirst();
                
                left++;
            }
            max = Math.max(max, (i - left + 1));
        }

        return max;
    }
}