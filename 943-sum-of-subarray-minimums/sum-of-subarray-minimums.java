class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum = 0;
        int MOD = 1000000007;
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            for(int j=i; j<arr.length; j++){
                min = Math.min(min, arr[j]);
                sum += min;
            }
        
            sum = sum%MOD;
        }
        return sum;
    }
}