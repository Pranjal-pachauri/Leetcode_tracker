# Last updated: 7/13/2026, 10:10:38 AM
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l=len(nums)
        res=(l*(l+1))/2
        su=sum(nums)
        return int(res-su)
        