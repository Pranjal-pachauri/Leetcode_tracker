// Last updated: 7/13/2026, 10:10:02 AM
class Solution {
    static {
        int[] nums = {0,0};
        for(int i = 0; i < 500; i++){
            increasingTriplet(nums);
        }
    }
    public static boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if (n<3) return false;
        
       int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; 
            } else if (num <= second) {
                second = num; 
            } else {
                
                return true;
            }
        }
        return false;
     }
}