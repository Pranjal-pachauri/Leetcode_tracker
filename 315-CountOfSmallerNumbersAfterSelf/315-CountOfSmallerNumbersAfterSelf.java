// Last updated: 7/13/2026, 10:10:15 AM
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int N = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int r = 1;
        for (int num : sorted) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }

        SegmentTree st = new SegmentTree(N);
        Integer[] res = new Integer[N];

        for (int i = N - 1; i >= 0; i--) {
            int ind = rank.get(nums[i]);
            res[i] = st.query(1, 1, N, 1, ind - 1); 
            st.update(1, 1, N, ind, 1);             
        }

        return Arrays.asList(res);
    }
}

class SegmentTree {
    int[] tree;
    SegmentTree(int n) {
        tree = new int[4 * n];
    }

    void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] += val;
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) update(2 * node, start, mid, idx, val);
        else update(2 * node + 1, mid + 1, end, idx, val);
        tree[node] = tree[2 * node] + tree[2 * node + 1];
    }

    int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        int mid = (start + end) / 2;
        return query(2 * node, start, mid, l, r) +
               query(2 * node + 1, mid + 1, end, l, r);
    }
}
