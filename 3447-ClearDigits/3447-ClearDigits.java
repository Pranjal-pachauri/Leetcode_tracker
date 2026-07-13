// Last updated: 7/13/2026, 10:00:42 AM
class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack =new Stack<>();
      
        for(char c:s.toCharArray()){
            if ('0'<=c && c<='9'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String res="";
        for(char c :stack){
            res+=c;
        }
        return res;
        
    }
}