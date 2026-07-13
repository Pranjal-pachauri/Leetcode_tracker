// Last updated: 7/13/2026, 10:03:42 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int a=0,b=0;
        while(a<word1.length() && b<word2.length()){
            s+=word1.charAt(a);
            s+=word2.charAt(b);
            a++;
            b++;
        }
        if(word1.length()>word2.length()){
            s+=word1.substring(a,word1.length());
        }else{
            s+=word2.substring(a,word2.length());
        }
    return s;}
}