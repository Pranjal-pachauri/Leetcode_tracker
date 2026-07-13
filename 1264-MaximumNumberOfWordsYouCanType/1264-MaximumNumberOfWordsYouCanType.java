// Last updated: 7/13/2026, 10:05:46 AM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String str[]=text.split(" ");
    if(brokenLetters.equals("")) return str.length;    
    int cnt=0;
    char ch[]=brokenLetters.toCharArray();
    for(String a:str){
        for(char b:ch){
           if( a.contains(String.valueOf(b))) {
            cnt++; break;
           }
        }
    }
   return (cnt==0)?0:str.length-cnt; }
}