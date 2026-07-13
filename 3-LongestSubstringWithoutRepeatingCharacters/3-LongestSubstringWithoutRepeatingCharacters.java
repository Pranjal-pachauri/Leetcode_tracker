// Last updated: 7/13/2026, 10:17:25 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int l=0,r=0,maxl=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                maxl=Math.max(maxl,r-l+1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
    return maxl;
    }
}