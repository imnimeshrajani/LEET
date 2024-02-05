class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        for(char c : ch) freq[c - 'a']++;
        for(int i = 0; i < ch.length; i++) if(freq[ch[i]-'a'] == 1) return i;
        return -1;
    }
}