// Last updated: 7/13/2026, 9:58:57 AM
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set=new HashSet<>();

        for(int i:bulbs){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);

        return list;
        
    }
}