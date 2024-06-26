class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0], second = cost[1];
	    for (int i = 2; i < cost.length; i++) {
		    int curr = cost[i] + Math.min(first, second);
		    first = second;
		    second = curr;
	    }
	    return Math.min(first, second);
    }
}