# Last updated: 7/13/2026, 10:03:20 AM
class Solution:
    def getLucky(self, s: str, k: int) -> int:
        st = ""
        sum=0
        for i in s:
            st = str(ord(i)-ord('a') +1) + st
        for i in range(0,k):
            sum=0
            for j in st:
                sum=int(j)+ sum
            st = str(sum)
        return sum
        