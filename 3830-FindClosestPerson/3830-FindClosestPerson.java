// Last updated: 7/13/2026, 10:00:10 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        return Math.abs(x - z) == Math.abs(y - z) ? 0 : Math.abs(x - z) < Math.abs(y - z) ? 1 : 2; //if its the same number, then return 0, else whatever is smaller wins
    }
}