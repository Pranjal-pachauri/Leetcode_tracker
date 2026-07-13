# Last updated: 7/13/2026, 10:16:17 AM
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        c=0
        k=len(nums)
        for i in range(k):
              if nums[i]!=val:
                    nums[c]=nums[i]
                    c+=1
      
        return c
        
        