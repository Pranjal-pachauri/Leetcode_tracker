// Last updated: 7/13/2026, 10:07:35 AM
class Solution {
    public int rotatedDigits(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (valid(i)) c++;
        }
        return c;
    }

    boolean valid(int num) {
        boolean hasGoodDigit = false;
        while (num != 0) {
            int rem = num % 10;
            if (rem == 3 || rem == 4 || rem == 7) return false;
            if (rem == 2 || rem == 5 || rem == 6 || rem == 9) hasGoodDigit = true; 
            num /= 10;
        }
        return hasGoodDigit; 
    }
}
