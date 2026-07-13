// Last updated: 7/13/2026, 10:00:43 AM
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        //to store color of a particular ball
        HashMap<Integer, Integer> ballToColor = new HashMap<>();
        //to store the freq of a color till each index.
        HashMap<Integer, Integer> colorFreq = new HashMap<>();
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int u = queries[i][0];
            int v = queries[i][1];
            //if the ball u is alraedy colored, then we need remove the existing color and and color v on it.
            if(ballToColor.containsKey(u)){
                int iniColor = ballToColor.get(u);
                colorFreq.put(iniColor, (colorFreq.getOrDefault(iniColor, 0) - 1));//freq of existing color decreased by 1.
                if(colorFreq.get(iniColor) <= 0) colorFreq.remove(iniColor);
                ballToColor.remove(u);
                
            }
            ballToColor.put(u, v);
       //freq of color v increased by 1;
            colorFreq.put(v, (colorFreq.getOrDefault(v, 0) + 1));
            //extracting number of color till this i.
            ans[i] = colorFreq.size();
        }
        return ans;
    }
}