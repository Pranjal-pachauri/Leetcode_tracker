// Last updated: 7/13/2026, 10:12:52 AM
class Solution {
    public boolean isPalindrome(String s) {
       
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }


        String filtered = sb.toString();
        String reversed = sb.reverse().toString();

        return filtered.equals(reversed);
    }
}
