// Last updated: 7/13/2026, 10:01:55 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->Integer.compare(b[k],a[k]));
        return score;
    }
}