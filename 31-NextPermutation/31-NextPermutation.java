// Last updated: 7/13/2026, 10:16:04 AM
class Solution {
    public void nextPermutation(int[] nums) {
        
        int pivit = -1,n=nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){ //12543
                pivit = i;
                break;
            }
        }
        if(pivit ==-1){
            reverse(nums,0,n-1);
            return;
        }else{
            int swapInd = -1;
            for(int i=n-1; i>=0; i--){
                if(nums[i]>nums[pivit]){
                    swapInd = i;
                    break;
                }
            }
            int temp = nums[pivit];
            nums[pivit] = nums[swapInd];
            nums[swapInd] = temp;
            reverse(nums,pivit+1, n-1);
            return;
        }
    }
    public void reverse(int nums[], int i, int j){
      
            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++; j--;
            }
    }
}