// Last updated: 7/13/2026, 10:07:46 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c:letters){
            if(c>target) return c;
        }
    return letters[0];}
}