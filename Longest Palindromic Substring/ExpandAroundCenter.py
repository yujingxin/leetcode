class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        start = 0
        end = 0
        if(s is None) or (len(s) <= 0):
            return ""
        for i in range(len(s)):
            len1 = self.expandAroundCenter(s, i, i)
            len2 = self.expandAroundCenter(s, i, i+1)
            length = max(len1, len2)
            if length > end - start:
                start = i - (length-1)/2
                end = i + length/2
        
        return s[start: end+1]

    def expandAroundCenter(self, s, left, right):
        l = left
        r = right
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1

        return r-l-1
