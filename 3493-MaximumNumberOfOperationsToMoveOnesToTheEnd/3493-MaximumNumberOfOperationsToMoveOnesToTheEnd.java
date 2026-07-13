// Last updated: 7/13/2026, 10:00:31 AM
class Solution {
    public int maxOperations(String s) {
        
        int i=0,on=0,cnt=0;

        while(i<s.length()){
            int j=i+1;
            if(s.charAt(i)=='1'){
                on++;
            }
            int z=0;
            while(j<s.length() && s.charAt(j)=='0'){
                z++;
                j++;
            }
            if(z>0){
                cnt=cnt+on;
            }
            i=j;
        }
    return cnt; }
}