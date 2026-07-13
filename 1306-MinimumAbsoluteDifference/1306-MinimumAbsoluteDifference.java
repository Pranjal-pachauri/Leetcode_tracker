// Last updated: 7/13/2026, 10:05:35 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int x = minval(arr);
        for(int i=0;i<arr.length-1;i++){
        if(Math.abs(arr[i]-arr[i+1])==x) {
     ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[i+1])));
        
            }
        }
   return ans; }



    public int minval(int nums[]) {
        int x = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int val = Math.abs(nums[i]-nums[i + 1]);
            if (val <= x)
                x = val;
        }
        return x;
    }
}