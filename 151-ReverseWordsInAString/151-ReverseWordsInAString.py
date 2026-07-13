# Last updated: 7/13/2026, 10:12:25 AM
class Solution:
    def reverseWords(self, s: str) -> str:
        l=s.split()
        l.reverse()
        return " ".join(l)
        