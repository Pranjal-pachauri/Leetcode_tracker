# Last updated: 7/13/2026, 10:09:46 AM
class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        a=[]
        for i in set(nums1):
            if i in set(nums2):
                a.append(i)
        return a        