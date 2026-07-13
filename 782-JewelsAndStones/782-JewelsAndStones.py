# Last updated: 7/13/2026, 10:07:42 AM
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        a=list(jewels.lower())
        b=list(stones.lower())
        c=0
        for i in stones:
            for j in jewels:
                if j ==i:
                    c+=1
        return c            
        # count = Counter(jewels)
        # ans = 0
        # for i in stones:
        #     ans += count[i]
        # return ans 