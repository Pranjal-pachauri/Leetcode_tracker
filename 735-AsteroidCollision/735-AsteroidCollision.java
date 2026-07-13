// Last updated: 7/13/2026, 10:07:53 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i : asteroids) {
            while (!st.isEmpty() && i < 0 && st.peek() > 0) {
                int top = st.peek();
                if (Math.abs(top) < Math.abs(i)) {
                    st.pop(); 
                } else if (Math.abs(top) == Math.abs(i)) {
                    st.pop();
                    i = 0;    
                    break;
                } else {
                    i = 0;
                    break;
                }
            }
            if (i != 0) st.push(i);
        }

        int[] res = new int[st.size()];
        for (int j = 0; j < res.length; j++) {
            res[j] = st.get(j);
        }
        return res;
    }
}
