// Last updated: 7/13/2026, 10:05:25 AM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();

        for( int i : nums1) s1.add(i);
        for( int i : nums2) s2.add(i);

        for(int v: s1) { if(!s2.contains(v)) l1.add(v);}

        for(int v: s2 ){ if(!s1.contains(v)) l2.add(v);}

    return Arrays.asList(l1,l2);}
}