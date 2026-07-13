// Last updated: 7/13/2026, 10:04:48 AM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res= new ArrayList<>();
        int v=0;

        for(int i=1;i<=n;i++){
            if(v==target.length) break;

           else  if(i==target[v]){
                res.add("Push");
                v++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }
            }

    return res;}
}