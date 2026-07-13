// Last updated: 7/13/2026, 10:02:02 AM
class Solution {
    private boolean findBobPath(ArrayList<ArrayList<Integer>> graph, int v, int par, ArrayList<Integer> currPath, ArrayList<Integer> bobPath)
    {
        if(v == 0)
        {
            bobPath.addAll(currPath);
            return true;
        }

        currPath.add(v);
        for(int nbr : graph.get(v))
        {
            if(par != nbr && findBobPath(graph, nbr, v, currPath, bobPath))
            return true;
        }

        currPath.remove(currPath.size()-1);
        return false;
    }
    private int findAlicePath(ArrayList<ArrayList<Integer>> graph, int v, int par, int[] amount)
    {
        int max = Integer.MIN_VALUE;
        for(int nbr : graph.get(v))
        {
            if(par != nbr)
            max = Math.max(max, findAlicePath(graph, nbr, v, amount) + amount[v]);
        }
        return max == Integer.MIN_VALUE ? amount[v] : max; // Leaf Node
    }
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++)
        graph.add(new ArrayList<>());
        
        for(int[] edge : edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        ArrayList<Integer> currPath = new ArrayList<>();
        ArrayList<Integer> bobPath = new ArrayList<>();
        
        findBobPath(graph, bob, -1, currPath, bobPath);

        int sz = bobPath.size();
        int i;
        for(i=0; i<sz/2; i++)
        amount[bobPath.get(i)] = 0;

        if(sz % 2 == 1)  // Odd Case
        amount[bobPath.get(i)] = 0;

        else // Even Case
        amount[bobPath.get(i)] /= 2;

        return findAlicePath(graph, 0, -1, amount);
    }
}
