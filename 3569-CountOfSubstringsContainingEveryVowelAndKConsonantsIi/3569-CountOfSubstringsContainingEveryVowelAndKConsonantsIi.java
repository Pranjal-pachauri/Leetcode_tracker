// Last updated: 7/13/2026, 10:00:30 AM
import java.util.*;

class Solution {
    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        // Build prefix sum array P: P[i] = number of consonants in word[0...i-1]
        int[] P = new int[n + 1];
        for (int i = 0; i < n; i++) {
            P[i + 1] = P[i] + (isVowel(word.charAt(i)) ? 0 : 1);
        }
        
        // positions[x] will store all indices i (0 <= i <= n) where P[i] equals x.
        int maxConsonants = P[n];
        ArrayList<Integer>[] positions = new ArrayList[maxConsonants + 1];
        for (int i = 0; i <= maxConsonants; i++) {
            positions[i] = new ArrayList<>();
        }
        for (int i = 0; i <= n; i++) {
            positions[P[i]].add(i);
        }
        
        // Track last occurrences of vowels: for 'a', 'e', 'i', 'o', 'u'
        int[] lastOccurrence = new int[5];
        Arrays.fill(lastOccurrence, -1);
        long result = 0;
        
        // Iterate j over the end indices of the substring
        for (int j = 0; j < n; j++) {
            char ch = word.charAt(j);
            if (isVowel(ch)) {
                lastOccurrence[chToIndex(ch)] = j;
            }
            // Determine the smallest last occurrence among vowels
            int minLast = Integer.MAX_VALUE;
            for (int occ : lastOccurrence) {
                minLast = Math.min(minLast, occ);
            }
            // If any vowel hasn't been seen yet, skip.
            if (minLast == -1) continue;
            
            // For substring [i, j] to have exactly k consonants:
            //   P[j+1] - P[i] == k  <=>  P[i] == P[j+1] - k
            int target = P[j + 1] - k;
            if (target < 0 || target >= positions.length) continue;
            // Only consider starting indices i that are <= minLast.
            // positions[target] is sorted; count how many are < minLast + 1.
            int count = countLessEqual(positions[target], minLast + 1);
            result += count;
        }
        
        return result;
    }
    
    // Helper: Count the number of elements in a sorted list that are less than x.
    private int countLessEqual(ArrayList<Integer> list, int x) {
        int lo = 0, hi = list.size() - 1, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) < x) { // we want indices i with i < x (i.e., i <= x-1)
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans + 1;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    private int chToIndex(char ch) {
        if (ch == 'a') return 0;
        if (ch == 'e') return 1;
        if (ch == 'i') return 2;
        if (ch == 'o') return 3;
        return 4; // for 'u'
    }
}