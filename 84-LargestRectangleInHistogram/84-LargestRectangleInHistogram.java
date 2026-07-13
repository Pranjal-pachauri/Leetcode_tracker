// Last updated: 7/13/2026, 10:14:15 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>  st= new Stack<>();
        int n=heights.length;
        int max=0;
        for(int i = 0; i <= n; i++){

            int h= (i==n ? 0: heights[i]);
            while(!st.isEmpty() && h<heights[st.peek()]){
                int hg=heights[st.pop()];
                int w=st.isEmpty()?i : i-st.peek()-1;
                max=Math.max(max,hg*w);
            }
            st.push(i);
        }
          return max;  }
}