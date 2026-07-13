// Last updated: 7/13/2026, 10:16:29 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
         Set<List<Integer>>set=new HashSet<>();
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            HashSet<Integer>hs=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long l=target-(nums[i]+(long)nums[j]+nums[k]);
                    if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE) {
                     int rl=(int)(l);

                    if(hs.contains(rl)){
                       
                        List<Integer>lt=new ArrayList<>();
                        lt.add(nums[i]);
                        lt.add(nums[j]);
                        lt.add(nums[k]);
                        lt.add(rl);
                        Collections.sort(lt);
                        set.add(lt);
                    }
                    }
                hs.add(nums[k]);
                }
            }
        }
        List<List<Integer>>list=new ArrayList<>();
        for(List a:set){
            list.add(a);
        }
        return list;
    }
}