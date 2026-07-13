// Last updated: 7/13/2026, 10:03:43 AM
class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1000000007; 
        int result = 0;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(i>0 && s.charAt(i-1) == s.charAt(i)){
                cnt++;
            }else{
                cnt = 1;
            }
            result = (result + cnt)%MOD;
        }return result;
        
    }
}