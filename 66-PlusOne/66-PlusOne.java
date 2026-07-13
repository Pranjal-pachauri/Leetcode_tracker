// Last updated: 7/13/2026, 10:14:50 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int arr[]=new int[n+1];
        arr[0]=1;
        return arr;
    }
}