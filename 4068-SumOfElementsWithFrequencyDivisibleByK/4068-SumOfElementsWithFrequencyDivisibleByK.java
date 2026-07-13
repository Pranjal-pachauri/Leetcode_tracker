// Last updated: 7/13/2026, 9:59:41 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        int sum=0;

        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);}

        for(int i:nums)
            {
                if(freq.get(i)%k==0){
                    sum+=i;
                }
            }
     return sum;   
    }
}