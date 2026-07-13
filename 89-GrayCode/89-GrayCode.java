// Last updated: 7/13/2026, 10:14:06 AM
class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < size; i++) result.add(i ^ (i >> 1));
        return result;
    }
}