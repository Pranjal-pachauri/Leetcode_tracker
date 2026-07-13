// Last updated: 7/13/2026, 10:02:56 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        for(int i:nums){
            if (i>0) l1.add(i);
            else l2.add(i);
        }
        int val=0,val1=0;
        for(int i=0;i<nums.length;i=i+2){
            nums[i]=l1.get(val);
            val++;
        }
        for(int i=1;i<nums.length;i=i+2){
            nums[i]=l2.get(val1);
            val1++;
        }
    return nums;}

}