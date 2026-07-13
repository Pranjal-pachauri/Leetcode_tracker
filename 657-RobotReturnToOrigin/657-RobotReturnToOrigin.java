// Last updated: 7/13/2026, 10:08:16 AM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char c:moves.toCharArray()){
           if(c=='U') y++;
           if(c=='D') y--;
           if(c=='L') x--;
           if(c=='R') x++;
        }
   return x==0 && y==0; }
}