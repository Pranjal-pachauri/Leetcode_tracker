// Last updated: 7/13/2026, 9:59:51 AM
class Solution {
    public int climbStairs(int n, int[] costs) {
        int mid = 0;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(0,n,costs,dp);
    }

    public static int solve(int i,int n,int[] costs,int [] dp)
    {
        if(i == n)
        {
            return 0;
        }

        if (dp[i] != -1) return dp[i];

        int minCost = Integer.MAX_VALUE;
        for (int jump = 1; jump <= 3; jump++) 
        {
            int j = i + jump;
            if (j <= n) 
            {
                int cost = costs[j - 1] + (j - i) * (j - i) + solve(j, n, costs, dp);
                minCost = Math.min(minCost, cost);
            }
        }

        return dp[i] = minCost;
    }
}