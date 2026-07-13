// Last updated: 7/13/2026, 10:04:41 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int w=0;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[w]=nums[i];
            w++;
            arr[w]=nums[n+i];
            w++;
        }
        

   return arr; }
}