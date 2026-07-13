// Last updated: 7/13/2026, 10:03:44 AM
class Solution {
    public int minOperations(String s) {
        int a = 0, b = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i % 2 == 0){
                if(c != '0') a++;
                if(c != '1') b++;
            } 
            else{
                if(c != '1') a++;
                if(c != '0') b++;
            }
        }
        return Math.min(a, b);
    }
}