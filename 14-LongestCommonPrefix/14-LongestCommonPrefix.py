# Last updated: 7/13/2026, 10:17:01 AM
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        l=""
        if strs is None or len(strs) == 0:
            return l
        m = len(strs[0])
        for i in range(1, len(strs)):
            m= min(m, len(strs[i]))
        for i in range(0, m):
            for j in range(0, len(strs)):
                if strs[j][i] != strs[0][i]:
                    return l
            l += strs[0][i]
        return l
        