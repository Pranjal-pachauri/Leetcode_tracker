// Last updated: 7/13/2026, 9:58:48 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str= new StringBuilder();
        for(String s: words){
            int sum=0;
        for(char ch :s.toCharArray()){
            sum+=weights[ch-'a'];
        }
            int mod=sum%26;
                char map=(char)('a'+(25-mod));
            str.append(map);
        }
   return str.toString(); }
}