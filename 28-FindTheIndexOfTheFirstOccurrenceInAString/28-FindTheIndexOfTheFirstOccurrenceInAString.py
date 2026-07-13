# Last updated: 7/13/2026, 10:16:07 AM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        lenNeedle = len(needle)
        lenHaystack = len(haystack)
        
        for i in range(lenHaystack - lenNeedle + 1):
            if needle == haystack[i:(i+lenNeedle)]:
                return i
        
        return -1
            
        