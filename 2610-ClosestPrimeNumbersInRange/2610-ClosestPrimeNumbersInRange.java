// Last updated: 7/13/2026, 10:01:56 AM
class Solution {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=  2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        if(arr.size() < 2){
            return new int[]{-1,-1};
        }

        int a =0,b=-1;
        int diff = Integer.MAX_VALUE;
        for(int i = 1;i<arr.size();i++){

            int temp = arr.get(i) - arr.get(i-1);
            if(diff > temp){
                diff = temp;
                a = i - 1;
                b = i;
            }
        }        
        return new int[]{arr.get(a),arr.get(b)};
    }
}