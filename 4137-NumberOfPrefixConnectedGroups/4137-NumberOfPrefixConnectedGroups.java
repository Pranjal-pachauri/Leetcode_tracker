// Last updated: 7/13/2026, 9:59:11 AM
class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String w: words){
            if(w.length()>=k){
                String prefix =w.substring(0,k);
                map.put(prefix,map.getOrDefault(prefix,0)+1);
                
            }
        }
        int c=0;
        for(int freq:map.values()){
            if(freq>=2) c++;
        }
        
    return c;}
}