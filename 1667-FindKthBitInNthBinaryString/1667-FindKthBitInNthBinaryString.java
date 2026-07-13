// Last updated: 7/13/2026, 10:04:13 AM
class Solution {
    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    
    String invert(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }else{
                sb.setCharAt(i,'1');
            }
            
        }
        return sb.toString();
    }
    

    
    public char findKthBit(int n, int k) {
        String s="0";
        
        for(int i=1;i<n;i++){
            String prev=s;
            s=prev+"1"+reverse(invert(prev));
        }

        char ans=s.charAt(k-1);
        return ans;
    }
}