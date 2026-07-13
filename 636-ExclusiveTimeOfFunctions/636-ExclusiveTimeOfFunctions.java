// Last updated: 7/13/2026, 10:08:23 AM
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int res[]= new int[n];
        Stack<Integer> st=new Stack<>();                
        int ptime=0;
        for(String str:logs){
            String [] s=str.split(":");
            int v=Integer.parseInt(s[0]);
            String name=s[1];
            int t=Integer.parseInt(s[2]);           
        
        if(name.equals("start")){
            if(!st.isEmpty()) res[st.peek()]+=t-ptime;
            st.push(v);                                    
            ptime=t;
        }
        else{
            res[st.pop()]+=t-ptime+1;
            ptime=t+1;

        }}
return res;    }
}