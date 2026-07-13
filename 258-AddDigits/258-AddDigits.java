// Last updated: 7/13/2026, 10:10:35 AM
class Solution {
    public int addDigits(int num) {
        int sum;
        while(num>=10){
            sum=0;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}