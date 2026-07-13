// Last updated: 7/13/2026, 10:15:26 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            List<String> list = new ArrayList<>();
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }
            else{
                list.add(s);
                map.put(sorted,list);
            }

        }
        List<List<String>> ans = new ArrayList<>();
        for(String e:map.keySet()){
            ans.add(new ArrayList<>(map.get(e)));
        }
        return ans;
    }
}