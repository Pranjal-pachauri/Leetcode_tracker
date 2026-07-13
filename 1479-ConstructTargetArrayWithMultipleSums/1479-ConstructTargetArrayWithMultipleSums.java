// Last updated: 7/13/2026, 10:05:03 AM
class Solution {
    public boolean isPossible(int[] target) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    long sum=0;
    for(int i:target){
        sum+=i;
        q.offer(i);
    }
    while(true){
       int maxv= q.poll();
       long rem=sum-maxv;
    if(rem==1 || maxv==1) return true;   
    if(rem==0 || maxv<rem) return false;
      
    long newv=maxv % rem ;
    if(newv==0) return false;
    sum=newv+rem;
    q.offer((int)newv);
    }        
   
}}