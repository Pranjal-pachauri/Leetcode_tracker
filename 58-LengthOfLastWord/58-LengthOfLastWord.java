// Last updated: 7/13/2026, 10:15:08 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1=s.split("\\s+");
        int len=0;
        for(int i=s1.length-1;i>=0;i--){
            len=s1[i].length();
            break;
        }
        return len;
    }
}