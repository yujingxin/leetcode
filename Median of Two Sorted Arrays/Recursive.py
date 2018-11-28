class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        num = nums1 + nums2
        num.sort()
        n = len(num)
        
        if n % 2 == 0 :
            return (num[n/2-1]+num[n/2])/2.0
        else :
            return num[(n-1)/2]
