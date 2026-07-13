// Last updated: 7/13/2026, 10:08:30 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len= flowerbed.length;
        if(len==1 && flowerbed[0]==0)
        return true;
        if(len>1 && flowerbed[0]==0 && flowerbed[1]==0){
            n--;
            flowerbed[0]=1;}
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0){
            n--;
            flowerbed[len-1]=1;
        }   
        for(int  i=1;i<len-1;i++){
            if(flowerbed[i]==0 && (flowerbed[i-1]==0 && flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
        }
        if(n>0) return false;
   return true; }
}