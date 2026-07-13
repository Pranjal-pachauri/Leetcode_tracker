# Last updated: 7/13/2026, 10:01:59 AM
class Solution:
    def pivotInteger(self, n: int) -> int:
        sqr = sqrt((n*(n+1))/2)
        intval = int(sqr)
        return intval if intval == sqr else -1        