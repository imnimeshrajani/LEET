// class Solution {
//     public boolean closeStrings(String word1, String word2) {
//         if(word1.length()!=word2.length()) return false;
//         int a1[] = new int[26], a2[] = new int[26];
//         Set<Character> st=new HashSet<>();
//         for(char c:word1.toCharArray()){
//             a1[c-'a']++;
//             st.add(c);
//         }
//         for(char c:word2.toCharArray()){
//             a2[c-'a']++;
//             if(!st.contains(c)) return false;
//         } 
//         Arrays.sort(a1);
//         Arrays.sort(a2);
//         for(int i=0;i<26;i++) if(a1[i]!=a2[i]) return false;
//         return true;
//     }
// }

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        if (n != word2.length())  return false;    
        if (word1.equals(word2))  return true;   

        int[] count1 = new int['z' + 1];     
        int[] count2 = new int['z' + 1];    
        byte[] bytes = new byte[n];
        word1.getBytes(0, n, bytes, 0);     // Faster than String.toCharArray().
        for (byte b : bytes)  count1[b]++;
        
        word2.getBytes(0, n, bytes, 0);
        for (byte b : bytes)  count2[b]++;
        
        int maxFreq = 0;
        for (int i = 'a'; i <= 'z'; i++)
            maxFreq = Math.max(maxFreq, Math.max(count1[i], count2[i]));

        byte[] freq = new byte[maxFreq + 1];    
        int count = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            int c1 = count1[i];
            int c2 = count2[i];
            if ((c1 == 0) ^ (c2 == 0))  return false;   
            if (c1 != 0) {
                int f1 = freq[c1]++;
                int f2 = freq[c2]--;
                if (f1 == 0)  count++;  else  if (f1 == -1)  count--;
                if (f2 == 0)  count++;  else  if (f2 ==  1)  count--;
            }
        }
        return count == 0;  
    }
}