// Last updated: 7/13/2026, 9:58:34 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
         }
        Map<Integer,Integer> freqcnt=new HashMap<>();
         for(int c:freq.values()){
            freqcnt.put(c,freqcnt.getOrDefault(c,0)+1);
         }
        for(int n:nums){
            if(freqcnt.get(freq.get(n))==1) return n;
        }
        
   return -1; }
}