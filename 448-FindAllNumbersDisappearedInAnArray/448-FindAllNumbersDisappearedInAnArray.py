# Last updated: 7/13/2026, 10:09:09 AM
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        # l=[]
        # for i in range(1,len(nums)+1):
            # if i not in nums:
                # l.append(i)
        # return l       
        for num in nums:
            idx = abs(num) - 1
            nums[idx] = -1 * abs(nums[idx])
        ans = []
        for i in range(len(nums)):
            if nums[i] > 0:
                ans.append(i + 1)
        return ans