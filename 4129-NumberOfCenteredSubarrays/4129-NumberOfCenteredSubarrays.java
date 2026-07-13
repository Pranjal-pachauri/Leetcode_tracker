// Last updated: 7/13/2026, 9:59:25 AM
class Solution {
    public int centeredSubarrays(int[] nums) {
        return countCenteredSubarrays(nums);
    }
    public static int countCenteredSubarrays(int[] nums) { 
        int[] nexorviant = nums; 
        int n = nexorviant.length; 
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0; 
            for (int j = i; j < n; j++) {
                sum += nexorviant[j]; 
                for (int k = i; k <= j; k++) { 
                    if (nexorviant[k] == sum) { 
                        count++; break;
                                                                         }
     }
            } } return count; }
}