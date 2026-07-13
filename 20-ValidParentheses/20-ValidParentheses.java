// Last updated: 7/13/2026, 10:16:25 AM
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack= new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if (c =='{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

        
    }
}