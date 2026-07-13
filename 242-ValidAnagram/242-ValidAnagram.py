# Last updated: 7/13/2026, 10:10:52 AM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # if len(s) != len(t):
        #     return False
        # x = set(s)
        # for i in x:
        #     if s.count(i) != t.count(i):
        #         return False
        # return True
        return Counter(s) == Counter(t)
        