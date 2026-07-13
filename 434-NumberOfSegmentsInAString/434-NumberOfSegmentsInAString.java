// Last updated: 7/13/2026, 10:09:16 AM
class Solution {
    public int countSegments(String s) {
        if (s.equals("")) return 0;
        String arr[]=s.split(" ");
        int count=0;
        for(String a:arr){
            if(!a.isEmpty())count++;
        }
        return count;}
}