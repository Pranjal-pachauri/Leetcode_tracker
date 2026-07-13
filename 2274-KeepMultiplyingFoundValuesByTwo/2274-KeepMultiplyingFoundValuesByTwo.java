// Last updated: 7/13/2026, 10:02:55 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        return find(nums,original);
    }

    static int find(int nums [], int v){
        for(int i: nums){
            if(i==v){
                v= v*2;
            }
        }
        
      return v;  
    }
}