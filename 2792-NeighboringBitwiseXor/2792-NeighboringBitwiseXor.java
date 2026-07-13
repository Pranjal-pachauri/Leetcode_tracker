// Last updated: 7/13/2026, 10:01:25 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int[] org=new int[n];

        //Populating the org array
        for(int i=1; i<n; i++){
            org[i]=derived[i-1]^org[i-1];
        }

        //Validating the rules for index i
        for(int i=0; i<n; i++){
            int idx=(i+1)%n;
            if(derived[i]!=(org[i]^org[idx])) return false;
        }

        return true;
    }
}