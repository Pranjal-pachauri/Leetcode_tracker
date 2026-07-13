// Last updated: 7/13/2026, 10:04:14 AM
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree=new int[n];
        for(List<Integer> edge:edges){
            indegree[edge.get(1)]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}