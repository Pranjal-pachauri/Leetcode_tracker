# Last updated: 7/13/2026, 10:11:41 AM
class Solution(object):

    def isIsomorphic(self, s, t):

        if len(s) != len(t):

            return False

        a = {}

        b = {}

        for i in range(len(s)):

            if s[i] not in a:

                a[s[i]] = t[i]

            elif a[s[i]] != t[i]:

                return False

            if t[i] not in b:

                b[t[i]] = s[i]

            elif b[t[i]] != s[i]:

                return False

        return True

        