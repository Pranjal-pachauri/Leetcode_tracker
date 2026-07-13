// Last updated: 7/13/2026, 10:12:36 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tcost=0,tgas=0;
        for(int i:gas){
            tgas+=i;
        }
        for(int j:cost){
            tcost+=j;
        }
         if(tgas<tcost) return -1;

        int curgas=0,start=0;
        for(int i =0;i<gas.length;i++){
            curgas+=gas[i]-cost[i];
            if(curgas<0){
                start=i+1;
                curgas=0;
            }
        }
        return start;
    }
}