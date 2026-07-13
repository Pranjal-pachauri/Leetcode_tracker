// Last updated: 7/13/2026, 10:02:49 AM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> ans= new ArrayList<>();
        int arr[]=new int[1001];
        for(int[] var:nums){
            for(int i:var){
                arr[i]++;
            }
        }
        for(int i=0;i<1001;i++){
            if(arr[i]==nums.length){
                ans.add(i);
            }
        }
return ans;
    }
}