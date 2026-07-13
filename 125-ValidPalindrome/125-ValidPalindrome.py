# Last updated: 7/13/2026, 10:13:02 AM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        a=""
        for i in s:
            if i in 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890':
                a+=i.lower()
        if a == a[::-1]:
            return True
        else:
            return False        