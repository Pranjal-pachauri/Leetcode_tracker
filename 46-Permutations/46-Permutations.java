// Last updated: 7/13/2026, 10:15:29 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
       getperm(nums,new ArrayList<>(),res);
       return res;

    }
    public void getperm(int nums[], List<Integer> list,List<List<Integer>> res){
        if(nums.length==list.size()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0 ;i<nums.length;i++){
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            getperm(nums,list,res);
            list.remove(list.size()-1);
        }
    }
}