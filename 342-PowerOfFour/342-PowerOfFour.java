// Last updated: 7/13/2026, 10:09:51 AM

class Solution {
public boolean isPowerOfFour(int n) {
for(int i=0;i<16;i++){
if(n==(int)Math.pow(4,i))
return true;
}
return false;}}