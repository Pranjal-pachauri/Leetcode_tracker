# Last updated: 7/13/2026, 10:14:44 AM
import math
class Solution:
    def mySqrt(self, x: int) -> int:
        p=math.sqrt(x)
        return int(abs(p))