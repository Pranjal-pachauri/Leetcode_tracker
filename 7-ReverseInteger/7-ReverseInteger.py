# Last updated: 7/13/2026, 10:17:14 AM
class Solution(object):
    def reverse(self, x):
        if x<0:
            x=int("-"+str(abs(x))[::-1])
        else:
            x = int(str(x)[::-1])
        if x<=(-2147483648) or x>=2147483648:
            return 0
        else :
            return  x
        