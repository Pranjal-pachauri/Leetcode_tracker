// Last updated: 7/13/2026, 10:05:54 AM

    // int lcs(String s1, String s2,int n, int m ){
    //     if(n==0||m==0) return 0;
    //     if(s1.charAt(n-1)==s2.charAt(m-1)) return lcs(s1,s2,n-1,m-1) + 1;
    //     else{
    //         int ans1=lcs(s1,s2,n-1,m);
    //         int ans2=lcs(s1,s2,n,m-1);
    //         return Math.max(ans1,ans2);
    //     }    

    // }



class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];


        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= m; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        // return lcs2(text1, text2, n, m, dp);
        return lcs3(text1, text2);
    }

//     int lcs2(String s1, String s2, int n, int m, int[][] dp) {
//         if (n == 0 || m == 0) return 0;
//         if (dp[n][m] != -1) return dp[n][m];
//         if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
//             dp[n][m] = 1 + lcs2(s1, s2, n - 1, m - 1, dp);
//         } else {
//             int ans1 = lcs2(s1, s2, n - 1, m, dp);
//             int ans2 = lcs2(s1, s2, n, m - 1, dp);
//             dp[n][m] = Math.max(ans1, ans2);
//         }

//         return dp[n][m];
//     }

public int lcs3(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        int[][] dp = new int[n+1][m+1];
        
        // Bottom-up DP
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
    }
}

