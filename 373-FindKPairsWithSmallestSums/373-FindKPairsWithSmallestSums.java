// Last updated: 7/13/2026, 10:09:39 AM
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (nums1[a[0]] + nums2[a[1]])
                - (nums1[b[0]] + nums2[b[1]]));

        for (int i = 0; i < nums1.length && i < k; i++) {

            heap.offer(new int[] { i, 0 });

        }
        while (!heap.isEmpty() && k > 0) {
            int cur[] = heap.poll();
            int i = cur[0];
            int j = cur[1];
            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                heap.offer(new int[]{i, j + 1});
            }
       k--; }
        return ans;
    }
}
