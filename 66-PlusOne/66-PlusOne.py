# Last updated: 7/13/2026, 10:15:05 AM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        a=int(''.join(map(str,digits)))+1
        b=[int(i) for i in str(a)]
        return b
