// Last updated: 7/13/2026, 10:17:21 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] merged = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        return median(merged);}

         private double median(int arr[]){
            int n=arr.length;
            if(n%2!=0) return arr[n/2];
            else return  (arr[n/2-1]+arr[n/2])/2.0;
        } 
         

        
    
}