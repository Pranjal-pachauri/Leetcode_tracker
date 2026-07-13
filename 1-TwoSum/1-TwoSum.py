# Last updated: 7/13/2026, 10:52:51 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    n.append(i)
                    n.append(j)
        n=list(set(n))
        return n
        