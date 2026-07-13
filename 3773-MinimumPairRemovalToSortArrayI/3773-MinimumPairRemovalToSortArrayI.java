// Last updated: 7/13/2026, 10:00:16 AM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            l.add(i);
        }
        int cnt=0;
        while(!issort(l)){
            int ind=sum(l);
            int val=l.get(ind)+l.get(ind+1);
            l.set(ind,val);
            l.remove(ind+1);
            cnt++;
        }
        
        
        return cnt;}

    public boolean issort(List<Integer> nums) {
        for (int i = 0; i < nums.size()- 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) return false;
        }
  return true;  }

    public int sum(List<Integer> nums) {
        int j = 0, min = Integer.MAX_VALUE, ind = 0;
        for (int i = 1; i < nums.size(); i++) {
            int sum = nums.get(i) + nums.get(j);
            if (sum < min) {
                min = sum;
                ind = j;              
            }
            j++;
        }
        return ind;
    }

}
















