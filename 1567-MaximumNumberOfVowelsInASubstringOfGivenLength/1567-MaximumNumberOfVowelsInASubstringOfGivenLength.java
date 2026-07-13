// Last updated: 7/13/2026, 10:04:44 AM
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowel(s.charAt(i))) count++;
        }
        int maxCount = count;
        for (int i = k; i < s.length(); i++) {
            if (vowel(s.charAt(i))) count++;
            if (vowel(s.charAt(i - k))) count--;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private boolean vowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}