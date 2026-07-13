// Last updated: 7/13/2026, 9:58:38 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = tosec(startTime );
        int end= tosec(endTime);
        return end-start;
        
    }
    private int tosec(String t){
        String st[]=t.split(":");
        int h=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        int s=Integer.parseInt(st[2]);
        return h*3600+m*60+s;
    }
}