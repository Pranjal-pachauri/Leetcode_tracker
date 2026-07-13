// Last updated: 7/13/2026, 10:04:53 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> l=new ArrayList<>();
      int max=Integer.MIN_VALUE;
      for(int v:candies){
            max=Math.max(max,v);
      }  
      for(int i:candies){
        if(i+extraCandies>=max) l.add(true);
        else l.add(false);
      }
    return l;}
}