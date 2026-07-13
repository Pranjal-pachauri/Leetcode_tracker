// Last updated: 7/13/2026, 10:11:02 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> H =new HashMap<>();
        for(int i=0;i<n;i++){
            H.put(nums[i],H.getOrDefault(nums[i],0)+1);
        } 
    for(Integer key: H.keySet()){
        if (H.get(key)>k) list.add(key);
    }
    return list;

        
    }
}