class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        if(n == 0) return true;
        for(int i = 0; i < m; i++) {
            if(n == 0) return true;
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == m-1 || flowerbed[i+1] == 0)) {
                n--;
                flowerbed[i]++;
            }
                
        }
        return n == 0;
    }
}