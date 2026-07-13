// Last updated: 7/13/2026, 9:59:17 AM
class Solution {
    public long sumAndMultiply(int n) {
      
        String s=String.valueOf(n).replace("0","");
        long  x=s.isEmpty() ? 0 : Long.parseLong(s);
        long sum =0;
        
        for(char c: s.toCharArray()){
            sum+=c-'0';
        }
  return x*sum;  }
}