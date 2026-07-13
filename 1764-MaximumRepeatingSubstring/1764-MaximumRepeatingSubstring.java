// Last updated: 7/13/2026, 10:04:11 AM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String s=word;

        while(sequence.contains(s)){
            c++;
            s+=word;
        }
        return c;
         }
}