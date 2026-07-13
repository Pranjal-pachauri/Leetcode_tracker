// Last updated: 7/13/2026, 10:06:09 AM
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] f = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            f[tiles.charAt(i) - 'A']++;
        }
        return helper("", new HashSet<>(), f);
    }
    public int helper(String str, Set<String> set, int[] freq) {
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                set.add(str + (char) ('a' + i));
                freq[i]--;
                helper(str + (char) ('a' + i), set, freq);
                freq[i]++;
            }
        }
        return set.size();
}
}