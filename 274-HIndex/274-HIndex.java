// Last updated: 7/13/2026, 10:10:29 AM
class Solution {
    public int hIndex(int[] citations) {
        int n= citations.length,v=0,ind=0,max=0;
        Arrays.sort(citations);
        while(v<n ){
        int c=0;
        for(int i: citations){
            if(citations[v]<=i){
            c++;}}
       
        // if(c>= citations[v]){
            
             ind = Math.max(ind , Math.min(c, citations[v])); 
             
        v++;}
     
   return ind; 
   }
   }
