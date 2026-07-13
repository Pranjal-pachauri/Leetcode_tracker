// Last updated: 7/13/2026, 10:06:25 AM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int mod = 0;  

        for (int bit : nums) {
            mod = ((mod << 1) + bit) % 5; 
            result.add(mod == 0);
        }

        return result;
    }
}