// Last updated: 7/13/2026, 10:07:32 AM
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans= new ArrayList<>();
        dfs(graph,0,new ArrayList(),ans);
        return ans;
    }
    private void dfs(int [][] graph,int node,List<Integer> path,List<List<Integer>> ans){
        path.add(node);
        if(node==graph.length-1) {
            ans.add(path); 
            return;}
        for(int it:graph[node])   {
            dfs(graph,it,new ArrayList<>(path),ans);
        } 
    }
}