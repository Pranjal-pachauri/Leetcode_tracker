// Last updated: 7/13/2026, 10:11:57 AM
class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        char[] bin = binarynum(n).toCharArray(); 
        for (char c : bin) {
            if (c == '1') cnt++;
        }
        return cnt;
    }

    String binarynum(int n) {
        return Integer.toBinaryString(n);
    }
}
