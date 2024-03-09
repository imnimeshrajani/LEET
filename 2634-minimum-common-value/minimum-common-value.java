class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        if (nums1[n-1] < nums2[0] || nums2[m-1] < nums1[0])
            return -1;
        while (i < n || j < m) {
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] < nums2[j] && i+1 < n) i++;
            else if(nums1[i] > nums2[j] && j+1 < m) j++;
            else return -1;
        }
        return -1;
    }
}