# Last updated: 7/13/2026, 10:09:31 AM
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        s=sorted(s)
        t=sorted(t)
        
        for i in range(len(t)):
            if i == len(s) or s[i] != t[i]:
                return t[i]
        return t[-1]