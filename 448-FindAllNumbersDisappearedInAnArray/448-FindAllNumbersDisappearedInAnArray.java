// Last updated: 7/13/2026, 10:09:02 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            set.add(i);
        }
        int i=1;
        while(i<=nums.length){
            if(!set.contains(i)) l.add(i); 
            i++;
        }
   return l;  }
}