// Last updated: 7/13/2026, 10:00:27 AM
class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int sum = 1; 
        for (int i = 0; i < n; ) {
            int j = i + 1;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int len = j - i;     
            if (len >= 2) {
                sum += (len - 1);  }
            i = j;
        }

        return sum;
    }

    }
