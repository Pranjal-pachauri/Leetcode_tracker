// Last updated: 7/13/2026, 10:16:44 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 =strs[0];
        String s2 =strs[strs.length-1];
        int len=Math.min(s1.length(),s2.length());
        String s="";
        for(int i=0;i<len;i++){
            if (s1.charAt(i)==s2.charAt(i))
            {
                s=s+s1.charAt(i);
            }
            else 
            {
                break;
            }
        
        }
        return s;
        
    }
}