// Last updated: 7/13/2026, 10:05:30 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
         
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         Set<Integer> seen= new HashSet<>(map.values());
        return seen.size()== map.size();

    }
}