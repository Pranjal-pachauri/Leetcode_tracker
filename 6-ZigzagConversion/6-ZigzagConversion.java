// Last updated: 7/13/2026, 10:17:15 AM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<numRows;i++){
            int ind=i;
            int dn=2*(numRows-1-i);
            int up=2*i;
            boolean dwn=true;

            while(ind<s.length()){
                sb.append(s.charAt(ind));

                if(i==0){
                    ind+=dn;
                }
                else if(i==numRows-1){
                    ind+=up;
                }
                 else{   
                    if(dwn){
                        ind+=dn;
                    }
                    else{
                        ind+=up;
                    }
                    dwn=!dwn;
            }
        }

        }
        return sb.toString();
        
    }
}