class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[] = new int[points.length], idx = 0, ans = 0;;
        for(var i : points) arr[idx++] = i[0];
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) ans = Math.max(ans, arr[i+1] - arr[i]);
        return ans;
    }
}