// Last updated: 7/13/2026, 10:07:58 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startcolor=image[sr][sc];
        if(startcolor==color) return image;
        dfs(image,sr,sc,startcolor,color);
        return image; 
    }
    private void dfs(int [][]img,int r, int c,int v,int color){
        if(r<0 ||c<0|| r>=img.length || c>=img[0].length) return ;
        if(img[r][c]!=v) return;
        img[r][c]=color;

        dfs(img,r,c-1,v,color);
        dfs(img,r,c+1,v,color);
        dfs(img,r+1,c,v,color);
        dfs(img,r-1,c,v,color);
    }
}