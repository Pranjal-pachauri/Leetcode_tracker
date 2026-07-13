// Last updated: 7/13/2026, 10:04:35 AM
class Solution {
    public int longestSubarray(int[] nums) {
      List<Integer> l= new ArrayList<>();
      int sum=0;
       boolean z=false;
       for(int i =0 ;i< nums.length;i++){               
        if (nums[i]==0){
            z=true;
            l.add(sum);
            sum=0;
        }
        else{
            sum+=1;

        }
       } 
       l.add(sum);
       int max= -1;
       for(int i=0; i<l.size()-1;i++){
        int c=l.get(i)+l.get(i+1);
        if(c>max){
            max=c;
        }
       }
        if(z==false) return nums.length-1;
        return max;

    }
}
















