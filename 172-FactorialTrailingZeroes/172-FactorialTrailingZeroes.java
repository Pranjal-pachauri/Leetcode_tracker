// Last updated: 7/13/2026, 10:12:05 AM
class Solution {
    public int trailingZeroes(int n) {
        int num=5,zero=0;  
        while(num<=n){
            zero+=n/num;
            num*=5;
        }
    return  zero;}
}