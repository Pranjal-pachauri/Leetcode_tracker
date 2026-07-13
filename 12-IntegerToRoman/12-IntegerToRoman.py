# Last updated: 7/13/2026, 10:17:09 AM
class Solution:
    def intToRoman(self, num: int) -> str:
        M=['','M','MM','MMM']
        C=['','C','CC','CCC','CD','D','DC','DCC','DCCC','CM']
        X=['','X','XX','XXX','XL','L','LX','LXX','LXXX','XC']
        I=['','I','II','III','IV','V','VI','VII','VIII','IX']
        return M[num//1000] + C[(num//100)%10] + X[(num//10)%10] + I[num%10]
        