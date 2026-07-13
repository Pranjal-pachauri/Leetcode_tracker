// Last updated: 7/13/2026, 10:04:10 AM
import java.util.*;

class Solution {
    public boolean closeStrings(String w1, String w2) {
        if (w1.length() != w2.length()) return false; // different sizes        
        int[] f1 = new int[26], f2 = new int[26];
        for (char c : w1.toCharArray()) f1[c-'a']++;
        for (char c : w2.toCharArray()) f2[c-'a']++;        
        // check both have same letters
        for (int i = 0; i < 26; i++)
            if ((f1[i]==0) != (f2[i]==0)) return false;        
        Arrays.sort(f1);
        Arrays.sort(f2);
        return Arrays.equals(f1, f2); // same frequency multiset
    }
}