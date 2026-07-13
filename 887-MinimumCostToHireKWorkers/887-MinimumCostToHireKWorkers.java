// Last updated: 7/13/2026, 10:07:25 AM
class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n=  quality.length;
        double worker [][]= new double[n][2];
        for(int i=0;i<n;i++){
            worker[i][0]=(double)wage[i]/quality[i];
            worker[i][1]=quality[i];
        }
        Arrays.sort(worker,(a,b)->Double.compare(a[0],b[0]));
        PriorityQueue<Integer> maxheap= new PriorityQueue<>(Collections.reverseOrder());
        double sum=0,mincost=Double.MAX_VALUE;
        for(double[] w :worker){
            double ratio  = w[0];
            int q = (int) w[1];
        

        maxheap.offer(q);
        sum+=q;
        if(maxheap.size()>k){
            sum-=maxheap.poll();
        }
        if(maxheap.size()==k){
            double cost=sum*ratio;
            mincost=Math.min(mincost,cost);
            }
        }
        return mincost;
        
    }
}