// Last updated: 7/13/2026, 10:03:38 AM
class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seg = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                seg = true;
            }
            if(seg && s.charAt(i) == '1'){
                return false;
            }
        }
        return true;
    }
}