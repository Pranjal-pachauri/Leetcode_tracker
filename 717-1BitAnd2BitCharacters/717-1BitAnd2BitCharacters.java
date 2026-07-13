// Last updated: 7/13/2026, 10:08:06 AM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int n=bits.length;
        while(i<n-1){
            i+=bits[i]+1;
        }
        return i==n-1;
    }
}