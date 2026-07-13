// Last updated: 7/13/2026, 10:03:40 AM
class Solution {
    public int[] minOperations(String boxes) {
        char ch[]=boxes.toCharArray();
        int i, n=boxes.length(), right=0, left=0, ans=0;
        for(i=0;i<n;i++){
            if(ch[i]=='1'){
                ans+=i;
            right++;
            }    
        }
        int res[]=new int[n];
        res[0]=ans;
        if(ch[0]=='1'){
            left++;
            right--;
        }
        for(i=1;i<n;i++){   
            ans=ans-right;
            ans=ans+left;
            if(ch[i]=='1'){
                right--;
                left++; 
            }
            res[i]=ans;
        }
        return res;
    }
}