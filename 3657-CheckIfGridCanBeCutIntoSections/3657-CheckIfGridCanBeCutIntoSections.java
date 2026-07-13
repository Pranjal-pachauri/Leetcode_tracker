// Last updated: 7/13/2026, 10:00:24 AM
class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) 
    {
        int count=0;
        int xaxis[][]=new int[rectangles.length][2];    
        int yaxis[][]=new int[rectangles.length][2];
        for(int i=0;i<rectangles.length;i++)
        {
            int stx=rectangles[i][0];
            int sty=rectangles[i][1];
            int enx=rectangles[i][2];
            int eny=rectangles[i][3];
            xaxis[i][0]=stx;
            xaxis[i][1]=enx;
            yaxis[i][0]=sty;
            yaxis[i][1]=eny;
        }
        Arrays.sort(xaxis,(a,b)->a[0]-b[0]);
        Arrays.sort(yaxis,(a,b)->a[0]-b[0]);
        int st=xaxis[0][0];
        int en=xaxis[0][1];
        for(int i=1;i<xaxis.length;i++)
        {
            if(en<=xaxis[i][0])
                count++;
            en=Math.max(en,xaxis[i][1]);
        }
        if(count>=2)
            return true;
        count=0;
        st=yaxis[0][0];
        en=yaxis[0][1];
        for(int i=1;i<yaxis.length;i++)
        {
            if(en<=yaxis[i][0])
                count++;
            en=Math.max(en,yaxis[i][1]);
        }
        return count>=2;
    }
}