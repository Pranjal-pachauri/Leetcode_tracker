// Last updated: 7/13/2026, 10:09:30 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
    int ind=0;
    for (char ch : t.toCharArray()) {
    if(ind< s.length() && ch==s.charAt(ind)){
        ind++;
    }
}
   
 return ind==s.length();}
}