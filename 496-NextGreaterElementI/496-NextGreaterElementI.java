// Last updated: 7/13/2026, 10:08:52 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }
            int nextGre=-1;
            for(int k=index+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    nextGre=nums2[k];
                    break;
                }
            }
            ans[i]=nextGre;
        }
        return ans;
    }
}