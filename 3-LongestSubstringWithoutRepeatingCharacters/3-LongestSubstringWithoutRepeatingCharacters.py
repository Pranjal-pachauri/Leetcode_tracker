# Last updated: 7/13/2026, 10:17:37 AM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s=="":
            return 0
        else:
            st=0
            e=0
            maxlength=0
            uc=[]
            while e<len(s):
                if s[e] not in uc:
                    uc.append(s[e])
                    e+=1
                    maxlength=max(maxlength,len(uc))
                else:
                    uc.remove(s[st])
                    st+=1
            return maxlength