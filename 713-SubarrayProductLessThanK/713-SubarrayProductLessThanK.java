// Last updated: 7/13/2026, 10:08:07 AM

// import java.util.*;
// public class product_k_array{
//     public static int numSubarrayProductLessThanK(int arr[],int k){
//         int maxm=0;
//         for(int i=0;i<=arr.length-k;i++){
//             int product=0;
//             for(int j=0;j<nums.length;j++){
//                 product*=arr[j+i];
//             }
//             if(product<k){
//                 maxm=product;
//             }
//             // or  maxm=Math.max(product,maxm);
//         }
//         return maxm;
//     }
//     @SuppressWarnings("resource")
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]= new int[n];
//         for(int i=0;i<n;i++) {
//             arr[i]=sc.nextInt();
//         }
//         int k=sc.nextInt();
//         System.out.println(numSubarrayProductLessThanK(arr,k));
//     }
// }

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(k<=1) return 0;
        int prod=1;
        int ans=0;
        int i=0;
        for(int j=0;j<n;j++){
           prod*=nums[j];
           while(prod>=k){
            prod/=nums[i];
            i++;
           }
           ans+=j-i+1;
        }
        return ans;
    }
}