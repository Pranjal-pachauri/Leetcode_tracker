// Last updated: 7/13/2026, 10:14:05 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        subsets(nums,0,new ArrayList<>(),ans);
        return ans;    }
    
    private void subsets(int[] nums, int ind, List<Integer> temp, List<List<Integer>> ans) {
        
            ans.add(new ArrayList<>(temp));

            for(int i =ind;i<nums.length;i++){
                if(i>ind && nums[i]==nums[i-1]) continue;
            
        

        temp.add(nums[i]);
        subsets(nums,i+1,temp,ans);
        temp.remove(temp.size()-1);
            }
    }
}