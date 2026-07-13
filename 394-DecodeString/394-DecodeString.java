// Last updated: 7/13/2026, 10:09:29 AM
class Solution {
    public String decodeString(String s) {
        Stack<Integer> num= new Stack<>();
        Stack<String> str =new Stack<>();
        String st="";
        int n=0;

        for(char c: s.toCharArray()){

            if(Character.isDigit(c)){
                n=n*10 +(c-'0');
            }
            else if (c=='['){
                num.push(n);
                n=0;
                str.push(st);
                st="";
            }
            else if (c==']'){
                int k=num.pop();
                String temp=st;
                st= str.pop();

                while(k>0){
                    st+=temp;
                    k--;
                }
            }
            else {
                st+=c;
            }
        }
return st; }
}