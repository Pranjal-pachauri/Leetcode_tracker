// Last updated: 7/13/2026, 9:59:54 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
         int arr []=new int[friends.length];
             int c=0;
        for(int i:order){
            for(int j: friends){
                if(i==j) {arr[c]=i;
                          c++;}
            }
        }
        
    return arr;}
}