// Last updated: 7/13/2026, 10:07:24 AM
class Solution {
    public int primePalindrome(int n) {
        for(int i=n;i<=Integer.MAX_VALUE;i++){
            if(10000000 < i && i < 100000000)
                i = 100000000;
            
            if(ispal(i)&&isprime(i)){
                return i;
            }
        }
        return -1;
        
    }
    public static boolean ispal(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
     public static boolean isprime(int num) {
        if (num <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; 
        }
        return true;
    }
}