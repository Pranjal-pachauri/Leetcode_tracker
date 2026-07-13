# Last updated: 7/13/2026, 10:15:20 AM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return(len(s.rstrip().split(" ")[-1]))
        