// Last updated: 7/13/2026, 10:10:14 AM
import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (stack.contains(c))
                continue;
            while (!stack.isEmpty() && c < stack.peek() && freq[stack.peek() - 'a'] > 0) {
                stack.pop();
            }
           stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);
        return sb.toString();
    }
}
