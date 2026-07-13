// Last updated: 7/13/2026, 10:12:35 AM
class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i:nums){ c^=i; } return c;  
    }
}