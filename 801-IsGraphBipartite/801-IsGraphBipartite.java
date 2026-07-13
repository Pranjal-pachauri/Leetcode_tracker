// Last updated: 7/13/2026, 10:07:41 AM
class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int vis[] = new int[v];
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                if(dfs(i,1,graph,vis)==false) return false; 
            }
        }
        return true;
    }
    public boolean dfs(int node, int col, int[][] graph, int[] vis){
        vis[node]=col;
        for(int i:graph[node]){
            if(vis[i]==0){
                if(dfs(i,-1*col,graph,vis)==false) return false;
            }
            else if(vis[i]==col) return false;
        }
        return true;
    }
}