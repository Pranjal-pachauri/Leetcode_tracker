// Last updated: 7/13/2026, 10:14:02 AM
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        Integer[] dp = new Integer[n];

        return solve(0, s, dp);
    }

    private int solve(int i, String s, Integer[] dp) {
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        int ways = solve(i + 1, s, dp);

        if (i + 1 < s.length()) {

            int num =(s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

            if (num >= 10 && num <= 26) {
                ways += solve(i + 2, s, dp);
            }
        }

        return dp[i] = ways;
    }
}

// class Solution {
//     public int numDecodings(String s) {
//         int n = s.length();
//         if (n == 0) {
//             return 0;
//         }

//         // Initialize the DP array
//         int[] dp = new int[n + 1];
//         dp[n] = 1; // There is one way to decode an empty string

//         // Fill in the DP array from right to left
//         for (int i = n - 1; i >= 0; i--) {
//             // Check for leading zero
//             if (s.charAt(i) == '0') {
//                 dp[i] = 0;
//             } else {
//                 // Decode single digit
//                 dp[i] += dp[i + 1];

//                 // Decode two digits if possible
//                 if (i + 1 < n && Integer.parseInt(s.substring(i, i + 2)) <= 26) {
//                     dp[i] += dp[i + 2];
//                 }
//             }
//         }

//         return dp[0];
//     }
// }