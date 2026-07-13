// Last updated: 7/13/2026, 10:08:55 AM
class Solution {
 static{
        for(int i = 0; i < 500; i++){
            findMaxConsecutiveOnes(new int[]{});
        }
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxl=0;
        int c=0;
        for(int i : nums){
            if (i==1) c++;
            else c=0;
        maxl=Math.max(c,maxl)     ;
             }
      return maxl;    
        }
    
}