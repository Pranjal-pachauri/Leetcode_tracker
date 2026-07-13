// Last updated: 7/13/2026, 9:59:44 AM
class Solution {
    public int longestBalanced(String s) {
        int n=s.length(),maxl=0;

        for(int i=0;i<n;i++){
            HashMap<Character,Integer> freq= new HashMap<>();
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
              freq.put(c,freq.getOrDefault(c,0)+1);

                  if(isbalance(freq)){
                  maxl=Math.max(maxl,j-i+1);
                  }
            }
        }
     return maxl;   
    }
    static boolean isbalance(HashMap<Character,Integer> freq) {
        int c=-1;
        for(int i:freq.values()){
            if(c==-1) c=i;
            else if (c !=i) return false;
        }
        return  true;
    }
}