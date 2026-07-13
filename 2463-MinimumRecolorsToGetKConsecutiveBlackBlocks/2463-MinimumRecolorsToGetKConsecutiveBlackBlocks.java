// Last updated: 7/13/2026, 10:02:34 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            white=0;
            for(int j=i;j<i+k;j++)
            {
                if(blocks.charAt(j)=='W')
                {
                    white++;
                }
            }
            min=Math.min(min,white);
        }
        return min;
    }
}