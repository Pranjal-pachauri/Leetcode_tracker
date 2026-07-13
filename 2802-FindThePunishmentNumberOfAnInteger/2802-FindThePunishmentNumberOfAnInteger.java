// Last updated: 7/13/2026, 10:01:27 AM
class Solution {
    public int punishmentNumber(int n) {
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), 0, i)) { 
                total += square; 
            }
        }
            return total;}
        private boolean canPartition(String s, int index, int target) {
        if (index == s.length()) return target == 0;  

        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');  // Form a number from substring
            if (num > target) break;  // Stop if the number is larger than target
            if (canPartition(s, i + 1, target - num)) return true;  // Recur for the next part
        }

        return false;
        
    }
 }