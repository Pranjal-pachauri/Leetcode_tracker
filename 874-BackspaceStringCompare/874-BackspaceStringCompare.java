// Last updated: 7/13/2026, 10:07:27 AM
     
    

class Solution {
    public String answer(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '#')
            stack.push(str.charAt(i));
            else if(!stack.isEmpty())
            stack.pop();
        }
        return String.valueOf(stack);
    }
    public boolean backspaceCompare(String s, String t) {
        return answer(s).equals(answer(t));
    }
}