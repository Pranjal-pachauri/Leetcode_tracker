// Last updated: 7/13/2026, 10:15:11 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>l= new ArrayList<>();
                int pre[]=intervals[0];
        for(int i=1;i< intervals.length;i++){
            int cur[]=intervals[i];
            if(cur[0]<=pre[1]){
                pre[1]=Math.max(pre[1],cur[1]);
            }else{
                l.add(pre);
                pre=cur;
            }

        }   
            l.add(pre);
        return l.toArray(new int[l.size()][]); }
        
    }
