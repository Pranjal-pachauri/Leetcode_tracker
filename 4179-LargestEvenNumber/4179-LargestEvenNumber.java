// Last updated: 7/13/2026, 9:59:04 AM
class Solution {
    public String largestEven(String s) {
        char[] arr = s.toCharArray(); 
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = arr[i] - '0';  
            if (digit % 2 == 0) {
             
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
