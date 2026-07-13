// Last updated: 7/13/2026, 10:10:39 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char c[]=s.toCharArray();
        char c1[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return new String(c).equals(new String(c1));


       
    }
}