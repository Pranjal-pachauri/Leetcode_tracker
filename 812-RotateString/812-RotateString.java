// Last updated: 7/13/2026, 10:07:34 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length() && (s + s).contains(goal));
    }
}