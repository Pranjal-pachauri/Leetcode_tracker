# Last updated: 7/13/2026, 10:16:03 AM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        else:
            if target not in nums:
                nums.append(target)
                p=sorted(nums)
                return p.index(target)