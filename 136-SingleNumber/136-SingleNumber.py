# Last updated: 7/13/2026, 10:12:43 AM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a=set(nums)
        for i in a:
            c=nums.count(i)
            if c==1:
                return i
        