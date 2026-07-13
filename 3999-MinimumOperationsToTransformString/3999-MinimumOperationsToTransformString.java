// Last updated: 7/13/2026, 9:59:59 AM
class Solution {
    public int minOperations(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int operations = 0;

        while (true) {
            boolean allA = true;
            int[] nextFreq = new int[26];

            for (int i = 0; i < 26; i++) {
                if (i != 0 && freq[i] > 0) {
                    allA = false;
                    nextFreq[(i + 1) % 26] += freq[i];
                } else {
                    nextFreq[i] += freq[i];
                }
            }

            if (allA) break;

            freq = nextFreq;
            operations++;
        }

        return operations;
    }
}
