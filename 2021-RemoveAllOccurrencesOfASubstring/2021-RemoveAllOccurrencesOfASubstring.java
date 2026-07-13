// Last updated: 7/13/2026, 10:03:27 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        int ind = s.indexOf(part);

        while(ind != -1){
            int last = ind + part.length();
            s = s.substring(0, ind) + s.substring(last, s.length());
            ind = s.indexOf(part);
        }
        
        return s;
    }
}