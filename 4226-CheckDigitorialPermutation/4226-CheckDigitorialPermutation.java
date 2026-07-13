// Last updated: 7/13/2026, 9:58:37 AM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        String s=sort(n);
        
        return s.equals(sort(1)) ||
            s.equals(sort(2)) ||
            s.equals(sort(145)) ||
            s.equals(sort(40585));
    }        
    String sort(int x){
        char[] c=String.valueOf(x).toCharArray();
        Arrays.sort(c);
        return new String (c);
    }
}