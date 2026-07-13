// Last updated: 7/13/2026, 9:59:02 AM
class Solution {
    public int residuePrefixes(String s) {
        Set <Character> seen = new HashSet<>();
        int r=0;
        for(int i=0;i<s.length();i++){
            seen.add(s.charAt(i));
            int l=i+1;
            if(seen.size()==l%3){
                r++;
            }
        }
     return r;   
    }
}