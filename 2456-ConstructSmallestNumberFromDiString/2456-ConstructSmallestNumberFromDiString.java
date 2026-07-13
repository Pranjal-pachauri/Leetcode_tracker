// Last updated: 7/13/2026, 10:02:35 AM
class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        char[] result = new char[n + 1];
        int num = 1, i = 0;
        
        while (i <= n) {
            if (i == n || pattern.charAt(i) == 'I') {
                int j = i;
                while (j >= 0 && result[j] == 0) {
                    result[j] = (char) ('0' + num++);
                    j--;
                }
            }
            i++;
        }
        
        return new String(result);
    }
}