// Last updated: 7/13/2026, 10:07:28 AM
import java.util.*;

class Solution {

    int n;
    int[] count;
    int[] ans;
    List<List<Integer>> tree;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        count = new int[n];
        ans = new int[n];
        tree = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        // Build graph
        for (int[] e : edges) {
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }

        // 1st DFS
        dfs1(0, -1);

    //     // 2nd DFS (re-rooting)
        dfs2(0, -1);

        return ans;
    }

    // Post-order DFS
    private void dfs1(int node, int parent) {
        count[node] = 1;
        for (int nei : tree.get(node)) {
            if (nei == parent) continue;
            dfs1(nei, node);
            count[node] += count[nei];
            ans[node] += ans[nei] + count[nei];
        }
    }

    // Pre-order DFS
    private void dfs2(int node, int parent) {
        for (int nei : tree.get(node)) {
            if (nei == parent) continue;
            ans[nei] = ans[node] - count[nei] + (n - count[nei]);
            dfs2(nei, node);
        }
    }
}