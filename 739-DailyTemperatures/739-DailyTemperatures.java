// Last updated: 7/13/2026, 10:07:47 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int [n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
            int ind=st.pop();
            ans[ind]=i-ind;
            }
        
        st.push(i); }


        // ans[n-1]=0;
        // for(int i=0;i<n-1;i++){
        // int j=i+1;
        // int c=0;
        // while(j<n){
        //     if(temperatures[i]<temperatures[j]) {
        //     {
        //         if(c==0) { c++; break;}
        //         else{ c++; break;}
        //     }}
                        
        // c++;
        // j++;
        // }
        // if (j==n) c=0;
        // ans[i]=c;
        // }
    return ans;}
}