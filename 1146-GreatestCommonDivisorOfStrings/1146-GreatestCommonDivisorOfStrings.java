// Last updated: 7/13/2026, 10:06:11 AM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
           if (!(str1 + str2).equals(str2 + str1)) return "";
           if(str1.equals(str2)) return str2;
           return str1.substring(0,gcd(str1.length(), str2.length()));

    }
    static int  gcd (int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
   return a; }
}