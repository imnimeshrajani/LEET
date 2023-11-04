class Solution {
    public int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        int ans = 0;
        for(int i = 0; i<mat.length;i++){
            int sum = 0;
            for(int j = 0; j<mat[0].length;j++) sum += mat[i][j];
            row[i] = sum;
        }
        for(int i = 0; i<mat[0].length;i++){
            int sum = 0;
            for(int j = 0; j<mat.length;j++) sum += mat[j][i];
            col[i] = sum;
        }
        for(int i = 0; i<mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                if(mat[i][j] == 1 && col[j] == 1 && row[i] == 1)  ans++;
            }
        }
        return ans;
    }
}