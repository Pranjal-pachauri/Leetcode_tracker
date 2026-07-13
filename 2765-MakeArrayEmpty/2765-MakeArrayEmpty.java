// Last updated: 7/13/2026, 10:01:40 AM
// class Solution {
//     public long countOperationsToEmptyArray(int[] nums) {
//         List<Integer> lst=new ArrayList<>();
//         for(int i:nums){lst.add(i);}
 
//         long c = 0;
//         while (!lst.isEmpty()) {
//             int smallest = sml(lst);
//             if (lst.get(0) == smallest) {
//                 lst.remove(0);
//             } else {
//                 int val = lst.remove(0);
//                 lst.add(val);
//             }
//             c++;
//         }
            
//         return c;
//         }
    
//         private int sml(List<Integer> list){
//             int n=list.get(0);
//             for(int i:list){if(i<n) n=i; }
//             return n;
//         }
        
    
// }



class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        
        List<Integer> lst = new ArrayList<>();
        for (int x : nums) lst.add(x);

     
        final int n = nums.length;
        long c = n;

       
        Map<Integer, Integer> pos = new HashMap<>(n);
        for (int i = 0; i < n; ++i) {
            pos.put(nums[i], i);
        }

        Arrays.sort(nums);
        for (int i = 1; i < n; ++i) {
            if (pos.get(nums[i]) < pos.get(nums[i - 1])) {
                c += (long)(n - i);
            }
        }

        return c;
       
    }

   
}
