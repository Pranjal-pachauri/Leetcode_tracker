// Last updated: 7/13/2026, 10:08:51 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;
        // if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())){
        //     return true;}

        return upper(word)|| lower(word)|| (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) ;
     }

     public boolean upper(String word){
         for(char c:word.toCharArray()){
            if(!Character.isUpperCase(c)) return false;
            
            }return true;
        }
     public boolean lower(String word){
         for(char c:word.toCharArray()){
            if(!Character.isLowerCase(c)) return false;
            
            }return true;
        }
}