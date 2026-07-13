// Last updated: 7/13/2026, 10:08:50 AM
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0; 
        int n = arr.length;

        while(i < n){
            int j = Math.min(i+k-1, n-1);
            reverse(arr, i, j);
            i = i+2*k;
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int i, int j){
        while(i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}