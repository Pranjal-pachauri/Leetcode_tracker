// Last updated: 7/13/2026, 10:52:50 PM
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
        
//        for(int i=0 ;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target) return new int[]{i,j}; 
//        }}
//   return  null; }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // won't reach here, guaranteed solution
    }
}

// public class Main {
//     public static String twoSum(int n, int []arr, int target) {
//         Arrays.sort(arr);
//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = arr[left] + arr[right];
//             if (sum == target) {
//                 return "YES";
//             } else if (sum < target) left++;
//             else right--;
//         }
//         return "NO";
//     }
