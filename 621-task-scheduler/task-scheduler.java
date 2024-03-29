class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n++ == 0) return tasks.length;
        int freq[] = new int[26], extra = 0, max = 0;
        for (char i : tasks) freq[i - 'A']++;
        
        for (int i : freq) {
            if (i > max) {
                max = i;
                extra = 1;
            } else if (i == max) {
                extra++;
            }
        }
        return Math.max(tasks.length, --max * n + extra);
    }
}