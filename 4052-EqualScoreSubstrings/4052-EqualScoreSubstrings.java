// Last updated: 7/13/2026, 9:59:49 AM
class Solution {
    public boolean scoreBalance(String s) {
        int n= s.length();
        int [] prefix =new int[n];

          prefix[0] = s.charAt(0) - 'a' + 1;
        for(int i=1 ;i< n;i++){
            prefix [i]=prefix[i-1]+(s.charAt(i) - 'a' + 1);
            
        }
        for(int i=0;i<n-1;i++){
            int l=prefix [i];
            int r=prefix[n-1]-prefix[i];
            if(l==r) return true;
        }
        return false;
    }
}