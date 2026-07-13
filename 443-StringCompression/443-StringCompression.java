// Last updated: 7/13/2026, 10:09:04 AM
class Solution {
    public int compress(char[] ch) {
        int w = 0, r = 0;

        while (r < ch.length) {
            char c = ch[r];
            int cnt = 0;

            while (r < ch.length && ch[r] == c) {
                r++;
                cnt++;
            }

            ch[w++] = c;

            if (cnt > 1) {
                for (char d : String.valueOf(cnt).toCharArray()) {
                    ch[w++] = d;
                }
            }
        }

        return w;
    }
}
