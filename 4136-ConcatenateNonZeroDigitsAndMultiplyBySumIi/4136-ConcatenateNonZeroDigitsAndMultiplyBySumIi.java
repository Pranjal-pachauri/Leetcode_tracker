// Last updated: 7/13/2026, 9:59:16 AM
class Solution {

    static final int MOD = 1_000_000_007;

    class Node {
        long value;
        int count;
        int sum;
    }

    Node[] tree;
    long[] pow10;
    char[] arr;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();
        arr = s.toCharArray();

        // Precompute powers of 10
        pow10 = new long[n + 1];
        pow10[0] = 1;

        for (int i = 1; i <= n; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            Node res = query(1, 0, n - 1,
                    queries[i][0], queries[i][1]);

            ans[i] = (int) ((res.value * res.sum) % MOD);
        }

        return ans;
    }

    void build(int idx, int l, int r) {

        tree[idx] = new Node();

        if (l == r) {

            int digit = arr[l] - '0';

            if (digit != 0) {

                tree[idx].value = digit;
                tree[idx].count = 1;
                tree[idx].sum = digit;
            }

            return;
        }

        int mid = (l + r) / 2;

        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);

        tree[idx] = merge(tree[idx * 2], tree[idx * 2 + 1]);
    }

    Node merge(Node left, Node right) {

        Node node = new Node();

        node.count = left.count + right.count;
        node.sum = left.sum + right.sum;

        node.value =
                (left.value * pow10[right.count]) % MOD;

        node.value =
                (node.value + right.value) % MOD;

        return node;
    }

    Node query(int idx,
               int l,
               int r,
               int ql,
               int qr) {

        if (qr < l || r < ql)
            return new Node();

        if (ql <= l && r <= qr)
            return tree[idx];

        int mid = (l + r) / 2;

        Node left =
                query(idx * 2, l, mid, ql, qr);

        Node right =
                query(idx * 2 + 1,
                        mid + 1,
                        r,
                        ql,
                        qr);

        return merge(left, right);
    }
}