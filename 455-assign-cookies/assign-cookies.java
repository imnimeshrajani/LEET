class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1, j = s.length - 1, c = 0;
        while(i >= 0 && j >= 0){
            if(g[i--] <= s[j]){
                j--;
                c++;
            }
        }

        return c;   
    }
}