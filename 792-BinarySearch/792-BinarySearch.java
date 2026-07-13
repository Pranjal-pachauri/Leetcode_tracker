// Last updated: 7/13/2026, 10:07:36 AM
// class Solution {
//     public int search(int[] nums, int target) 
//     {
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]== target ) return i;
//         }
        
//     return -1; }
// }
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; 
    }
}