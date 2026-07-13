// Last updated: 7/13/2026, 10:11:39 AM
class Solution {
    public boolean isHappy(int n) {
        int slow=sq(n);
        int fast=sq(sq(n));

        while(slow!=fast){
            slow=sq(slow);
            fast=sq(sq(fast));
            if(slow==1||fast==1) return true;
        }
        return slow==1;
    }

    int sq(int n){
        int sum=0;
        while(n>0){
           int num= n%10;
            sum+=num*num;
            n/=10;}
        return sum;
    }
}