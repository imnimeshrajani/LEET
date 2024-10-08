class Node{
    public Node[] child;
    public boolean isEnd;
    public Node(){
        child = new Node[26];
        isEnd = false;
    }
}
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Node root = new Node();
        for(String str: dictionary){
            insert(str, root);
        }
        int n = s.length();
        int[] dp = new int[n+1];
        for(int i = 0; i < n+1; i++){
            dp[i] = i;
        }

        for(int i = 0; i < n; i++){
            search(s, root, i, dp);
            dp[i+1] = Math.min(dp[i+1], dp[i]+1);
        }
        return dp[n];
    }
    public void insert(String s, Node root){
        for(int i = 0; i < s.length(); i++){
            int path = s.charAt(i) - 'a';
            if(root.child[path] == null){
                Node node = new Node();
                root.child[path] = node;
            }
            root = root.child[path];
        }
        root.isEnd = true;
    }
    public void search(String s, Node root, int idx, int[] dp){
        for(int i = idx; i < s.length(); i++){
            int path = s.charAt(i) - 'a';
            if(root.child[path] != null){
                root = root.child[path];
                if(root.isEnd){
                    dp[i+1] = Math.min(dp[i+1], dp[idx]);
                }
            } else {
                return;
            }
        }
    }
}