// Last updated: 7/13/2026, 10:00:29 AM
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int l=nums.size();
        int ans[]=new int[l];
        for(int i=0;i<l;i++){
            int v=1;
            ans[i]=-1;
            while(v<=nums.get(i)){
            if(((v-1)|v)==nums.get(i)){ ans[i]=v-1;
            break;}
            v++;}      

        }
        
    return ans;}
}