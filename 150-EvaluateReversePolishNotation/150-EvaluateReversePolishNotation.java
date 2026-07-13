// Last updated: 7/13/2026, 10:12:19 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        // int ans=0;
        for(int i=0;i<tokens.length;i++){
            
            if(tokens[i].equals("+")) {
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a+b));
            }
            else if(tokens[i].equals("*")) {
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a*b));
            }
            else if(tokens[i].equals("-")) {
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a-b));
            }
            else if(tokens[i].equals("/")) {
                int b=Integer.parseInt(st.pop());
                int a=Integer.parseInt(st.pop());
                st.push(String.valueOf(a/b));
            }
            else {
                st.push(tokens[i]);

            }
        }
   return Integer.parseInt(st.pop()); }
}